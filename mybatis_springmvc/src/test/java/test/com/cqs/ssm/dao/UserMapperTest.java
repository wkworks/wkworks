package test.com.cqs.ssm.dao;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cqs.ssm.dao.UserMapper;


public class UserMapperTest {
	
	private ApplicationContext applicationContext;
	
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
	}
	@Test
	public void testFindUser() throws Exception {
		//方法一
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		System.out.println(userMapper.findUser());
				
		//方法二
		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper1 = sqlSession.getMapper(UserMapper.class);
		System.out.println(userMapper1.findUser().get(1).getBirthday());
		
		
	}
}
