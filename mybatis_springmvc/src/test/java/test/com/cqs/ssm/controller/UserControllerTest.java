package test.com.cqs.ssm.controller;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cqs.ssm.controller.UserController;

public class UserControllerTest {

private ApplicationContext applicationContext;
	
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("springmvc.xml");
	}

	@Test
	public void test() {
		UserController userController = (UserController) applicationContext.getBean("userController");
		System.out.println(userController.getClass());
	}

}
