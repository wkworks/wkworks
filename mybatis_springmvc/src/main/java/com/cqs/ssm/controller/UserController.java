package com.cqs.ssm.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cqs.ssm.pojo.User;
import com.cqs.ssm.service.UserService;

@Controller("userController")
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/findUser")
	public String findUser(HttpServletRequest request){
		
		List<User> listUser = userService.findUser();
		System.out.println(listUser);
		request.setAttribute("listUser", listUser);
		return "userlist";
	}
}

