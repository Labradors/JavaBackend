package tech.jiangtao.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import tech.jiangtao.mybatis.mapper.UserMapper;
import tech.jiangtao.mybatis.pojo.User;
import tech.jiangtao.mybatis.pojo.UserCustom;
import tech.jiangtao.mybatis.pojo.UserQuery;

public class CacheTest {
	
	private SqlSessionFactory sessionFactory;

	@Before
	public void init(){
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testCache2() {
		SqlSession session = sessionFactory.openSession();
		SqlSession session1 = sessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		UserMapper mapper1 = session1.getMapper(UserMapper.class);
		try {
			System.out.println(mapper.findUserById(1).toString());
			session.close();
			System.out.println(mapper1.findUserById(1).toString());
			session1.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
