package tech.jiangtao.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tech.jiangtao.springmvc.model.ItemsCustom;
import tech.jiangtao.springmvc.service.ItemsService;
import java.util.List;

/**
 * @class: ItemsController </br>
 * @description:  商品查询 </br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/3/26 下午11:56</br>
 * @version: 0.0.1 </br>
 * 注意事项： service最好使用接口进行声明，这样的话不容易出错
 **/
@Controller
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception {
        System.out.println("成功进入");
        List<ItemsCustom> itemsList = itemsService.findItemsList(null);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsList", itemsList);
        modelAndView.setViewName("itemsList");
        return modelAndView;
    }
}
