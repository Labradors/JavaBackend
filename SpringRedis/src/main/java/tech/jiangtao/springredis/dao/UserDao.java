package tech.jiangtao.springredis.dao;

import org.springframework.stereotype.Repository;
import tech.jiangtao.springredis.model.User;

/**
 * @class: UserDao </br>
 * @description:  </br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/4/1 上午9:42</br>
 * @version: 0.0.1 </br>
 **/
public interface UserDao {

  public void saveUser(User user) throws Exception;

  public User findUser(Integer  id) throws Exception;

  public void deleteUser(Integer  id) throws Exception;
}
