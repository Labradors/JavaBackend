package tech.jiangtao.springredis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.jiangtao.springredis.dao.UserDao;
import tech.jiangtao.springredis.mapper.UserMapper;
import tech.jiangtao.springredis.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;

  @Autowired
  private UserMapper userMapper;

  @Override public void saveUser(User user) throws Exception {
    userMapper.insert(user);
  }

  @Override public User findUser(Integer id) throws Exception {
    return userMapper.selectByPrimaryKey(id);
  }

  @Override public void deleteUser(Integer id) throws Exception {
    userDao.deleteUser(id);
  }
}
