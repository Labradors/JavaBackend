package tech.jiangtao.springredis.service;

import tech.jiangtao.springredis.model.User;

public interface UserService {

  public void saveUser(User user) throws Exception;

  public User findUser(Integer id) throws Exception;

  public void deleteUser(Integer id) throws Exception;

}
