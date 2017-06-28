package test.com.cqs.ssm.service;


import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cqs.ssm.pojo.User;
import com.cqs.ssm.service.UserService;

public class UserServiceTest {

	private ApplicationContext applicationContext;
	
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
	}

	@Test
	public void testFindUser() {
		UserService userService = (UserService) applicationContext.getBean("userService");
		List<User> userList = userService.findUser();
		System.out.println(userList.size());
	}

}
