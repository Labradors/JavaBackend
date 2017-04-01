package tech.jiangtao.springredis.controller;

import java.util.Date;
import java.util.Random;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tech.jiangtao.springredis.dao.UserDao;
import tech.jiangtao.springredis.model.User;
import tech.jiangtao.springredis.service.UserService;

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

  @RequestMapping("/add")
  public @ResponseBody User addUser(String username, Date birthday, String sex,
      String address) {
    User user = new User();
    user.setId((new Random().nextInt(1000000)));
    user.setUsername(username);
    user.setAddress(address);
    user.setBirthday(birthday);
    user.setSex(sex);
    try {
      userService.saveUser(user);
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
  public @ResponseBody User queryUser(@PathVariable("id") Integer id){
    try {
      return userService.findUser(id);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

}
