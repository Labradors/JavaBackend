package tech.jiangtao.springmvc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tech.jiangtao.springmvc.model.User;

/**
 * @class: LoginController </br>
 * @description: 认证</br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/3/28 下午11:28</br>
 * @version: 0.0.1 </br>
 **/
@RestController
@RequestMapping("/auth")
public class LoginController {

  @RequestMapping("/login/{username}/{password}")
  public @ResponseBody User login(@PathVariable("username") String username,
      @PathVariable("password") String password) {
    User user = new User();
    user.setUsername(username);
    user.setAddress(password);
    return user;
  }

  @RequestMapping("/logout")
  public @ResponseBody String logout() {
    return "true";
  }
}
