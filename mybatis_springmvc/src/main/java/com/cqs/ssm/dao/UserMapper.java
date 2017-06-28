package com.cqs.ssm.dao;

import java.util.List;

import com.cqs.ssm.pojo.User;

public interface UserMapper {
	public List<User> findUser();
}
