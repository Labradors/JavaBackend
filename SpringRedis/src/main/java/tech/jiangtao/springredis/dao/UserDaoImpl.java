package tech.jiangtao.springredis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;
import tech.jiangtao.springredis.model.User;

/**
 * @class: UserDaoImpl </br>
 * @description:  </br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/4/1 上午9:42</br>
 * @version: 0.0.1 </br>
 **/
@Repository("userDao")
public class UserDaoImpl implements UserDao {

  @Autowired
  private RedisTemplate<String,User> redisTemplate;

  @Override public void saveUser(User user) throws Exception {
    ValueOperations<String,User> valueOpera = redisTemplate.opsForValue();
    valueOpera.set(user.getId().toString(),user);
  }

  @Override public User findUser(Integer id) throws Exception {
    ValueOperations<String,User> valueOpera = redisTemplate.opsForValue();
    return valueOpera.get(id.toString());
  }

  @Override public void deleteUser(Integer id) throws Exception {
    ValueOperations<String,User> valueOpera = redisTemplate.opsForValue();
    RedisOperations<String,User> redisOpera = valueOpera.getOperations();
    redisOpera.delete(id.toString());
  }
}
