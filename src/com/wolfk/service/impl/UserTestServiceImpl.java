package com.wolfk.service.impl;

import java.util.List;

import com.wolfk.mapper.UserTestMapper;
import com.wolfk.pojo.UserTestPojo;
import com.wolfk.service.UserTestService;

public class UserTestServiceImpl implements UserTestService {
	UserTestMapper userTestMapper;

	public UserTestMapper getUserTestMapper() {
		return userTestMapper;
	}

	public void setUserTestMapper(UserTestMapper userTestMapper) {
		this.userTestMapper = userTestMapper;
	}

	@Override
	public List<UserTestPojo> selectUsers() {
		return userTestMapper.selectUsers();
	}

}
