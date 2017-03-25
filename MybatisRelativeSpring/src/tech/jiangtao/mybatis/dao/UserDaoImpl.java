package tech.jiangtao.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import tech.jiangtao.mybatis.pojo.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	
	private SqlSessionFactory sqlSessionFactory;

	@Override
	public User findUserById(int id) throws Exception {
		SqlSession session = this.getSqlSession();
		User user = session.selectOne("test.findUserById",id);
		return user;
	}

}
