package tech.jiangtao.springmvc.controller.json;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tech.jiangtao.springmvc.model.ItemsCustom;

/**
 * @class: JsonController </br>
 * @description: 输入输出json案例 </br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/3/28 上午9:54</br>
 * @version: 0.0.1 </br>
 **/
@Controller
@RequestMapping("/json")
public class JsonController {

  /**
   * 传递json，响应json
   * @param itemCustom
   * @return
   * @throws Exception
   */
  @RequestMapping("/requestItems")
  public @ResponseBody ItemsCustom requestItems(@RequestBody ItemsCustom itemCustom) throws Exception {
    return itemCustom;
  }

  /**
   * 请求
   * @param itemCustom
   * @return
   * @throws Exception
   */
  @RequestMapping("/requestItemsJson")
  public  @ResponseBody ItemsCustom requestJson(ItemsCustom itemCustom) throws Exception{
    return itemCustom;
  }
}
