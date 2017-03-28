package tech.jiangtao.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import tech.jiangtao.springmvc.exception.CustomException;
import tech.jiangtao.springmvc.model.Items;
import tech.jiangtao.springmvc.model.ItemsCustom;
import tech.jiangtao.springmvc.model.ItemsQuery;
import tech.jiangtao.springmvc.service.ItemsService;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @class: ItemsController </br>
 * @description: 商品查询 </br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/3/26 下午11:56</br>
 * @version: 0.0.1 </br> 注意事项： service最好使用接口进行声明，这样的话不容易出错
 **/
@Controller
@RequestMapping("/items")
public class ItemsController {

  @Autowired
  private ItemsService itemsService;

  // 使用@ModelAttribute进行抽取，将常用的值传入
  @ModelAttribute("itemsType")
  public Map<String, String> getItemsType() {
    Map<String, String> map = new HashMap<>();
    map.put("001", "家电");
    map.put("002", "数码");
    return map;
  }

  /**
   * 这种方式来解析日期，只能在当前类中使用
   * 可以用父类来做，不过这总插入式的方式不好，尽量避免
   * 也可以自定义属性编辑器，在处理器扫描器中添加。
   */
  @InitBinder
  public void initBinder(WebDataBinder binder) {
    binder.registerCustomEditor(Date.class,
        new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH-mm-ss"), true));
  }

  /**
   * 查询所有商品
   *
   * @throws Exception
   */
  @RequestMapping("/queryItems")
  public ModelAndView queryItems() throws Exception {
    System.out.println("成功进入");
    List<ItemsCustom> itemsList = itemsService.findItemsList(null);
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("itemsList", itemsList);
    modelAndView.setViewName("itemsList");
    return modelAndView;
  }

  /**
   * 查看编辑页面
   */
  @RequestMapping(value = "/editItems")
  public ModelAndView editItems(@RequestParam Integer id) throws Exception {
    if (id==null){
      throw new CustomException("没有查询到任何商品");
    }
    System.out.println("id的值为" + id);
    ItemsCustom items = null;
    ModelAndView modelAndView = new ModelAndView();
    try {
      items = itemsService.findItemsById(id);
    } catch (Exception e) {
      e.printStackTrace();
    }
    modelAndView.addObject("item", items);
    modelAndView.setViewName("editItem");
    return modelAndView;
  }

  /**
   * 批量编辑页面查询
   */
  @RequestMapping(value = "/editItemsList")
  public ModelAndView editItemsList() {
    System.out.println("成功进入");
    List<ItemsCustom> itemsList = null;
    try {
      itemsList = itemsService.findItemsList(null);
    } catch (Exception e) {
      e.printStackTrace();
    }
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("itemsList", itemsList);
    modelAndView.setViewName("editItemsList");
    return modelAndView;
  }

  /**
   * 批量删除接口
   * 使用包装类型
   *
   * @throws Exception
   */
  @RequestMapping(value = "/editItemsListSubmit")
  public String editItemsListSubmit(ItemsQuery itemsQuery) throws Exception {

    return "success";
  }

  /**
   * 更新单条商品的信息
   * 校验信息
   * bindingResult: 接收校验的错误信息
   * @throws Exception
   */
  @RequestMapping(value = "/updateItems", method = RequestMethod.POST)
  public ModelAndView updateItems(Integer id, @Validated @ModelAttribute(value = "item") Items item,
      BindingResult bindingResult, MultipartFile pictureFile) throws Exception {
    ItemsCustom custom = new ItemsCustom();
    ModelAndView modelAndView = new ModelAndView();
    custom.setId(item.getId());
    custom.setCreatetime(item.getCreatetime());
    custom.setDetail(item.getDetail());
    custom.setName(item.getName());
    custom.setPic(item.getPic());
    custom.setPrice(item.getPrice());
    // 图片上传
    if (pictureFile != null&&!pictureFile.isEmpty()) {
      String filePath = "";
      // 获取图片的原始名称
      String name = pictureFile.getOriginalFilename();
      System.out.println(name.indexOf("."));
      String newName = UUID.randomUUID() + name.substring(name.indexOf("."),name.length());
      File file = new File(newName);
      // 将内存中的文件写入磁盘
      pictureFile.transferTo(file);
      // 图片上传成功，将新图片的地址写入数据库
      custom.setPic(newName);
    }
    if (bindingResult.hasErrors()){
      List<ObjectError> errors = bindingResult.getAllErrors();
      for (ObjectError error: errors) {
        System.out.println(error.getDefaultMessage());
      }
      modelAndView.addObject("errors",errors);
      return null;
    }
    itemsService.updateItems(id, custom);
    modelAndView.setViewName("editItem");
    return modelAndView;
  }

  /**
   * 删除商品
   *
   * @throws Exception
   */
  @RequestMapping("/deleteItems")
  public String deleteItems(Integer[] delete_id) throws Exception {
    return "success";
  }

  @RequestMapping("/viewItems/{id}")
  public @ResponseBody ItemsCustom viewItems(@PathVariable("id") Integer id) throws Exception{
    return itemsService.findItemsById(id);
  }
}
