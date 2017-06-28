package com.cqs.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cqs.ssm.dao.UserMapper;
import com.cqs.ssm.pojo.User;
import com.cqs.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	public List<User> findUser() {
		List<User> userList = userMapper.findUser();
		return userList;
	}

}
