//package tech.jiangtao.mybatis.dao;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class UserDaoImplTest {
//	
//	private ApplicationContext applicationContext;
//
//	@Before
//	public void init(){
//		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//	}
//	
//	@Test
//	public void testFindUserById() {
//		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//		try {
//			System.out.println(userDao.findUserById(1).toString());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//}
