package tech.jiangtao.mybatis.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMapperTest {

	private ApplicationContext applicationContext;

	@Before
	public void init(){
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void testFindUserById() {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		try {
			System.out.println(userMapper.findUserById(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
