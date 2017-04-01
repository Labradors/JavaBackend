package tech.jiangtao.springredis.controller;

import java.util.Date;
import java.util.Random;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tech.jiangtao.springredis.dao.TokenManager;
import tech.jiangtao.springredis.model.TokenModel;
import tech.jiangtao.springredis.model.User;
import tech.jiangtao.springredis.service.UserService;
import tech.jiangtao.springredis.utils.Authorization;

/**
 * @class: UserController </br>
 * @description: 用户控制器 </br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/4/1 上午9:50</br>
 * @version: 0.0.1 </br>
 **/
@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @Autowired
  private TokenManager tokenManager;

  @RequestMapping("/add")
  public @ResponseBody User addUser(String username, Date birthday, String sex,
      String address,HttpServletResponse response) {
    User user = new User();
    user.setId((new Random().nextInt(1000000)));
    user.setUsername(username);
    user.setAddress(address);
    user.setBirthday(birthday);
    user.setSex(sex);
    try {
      userService.saveUser(user);
      TokenModel model = tokenManager.createToken(user.getId());
      response.setHeader(Authorization.AUTHORIZATION,user.getId()+"-"+model.getToken());
      return user;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  @RequestMapping("/delete/{id}")
  public @ResponseBody void delete(@PathVariable("id") Integer id){
    try {
      userService.deleteUser(id);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @RequestMapping("/query/{id}")
  public @ResponseBody User queryUser(@RequestParam("id") Integer id){
    try {
      return userService.findUser(id);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

}
