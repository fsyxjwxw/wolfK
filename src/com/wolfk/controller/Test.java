package com.wolfk.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wolfk.pojo.UserTestPojo;
import com.wolfk.service.UserTestService;

/**
 * @author Redfield
 *
 * @date 2019Äê7ÔÂ4ÈÕ
 */
@Controller
public class Test {
	UserTestService userTestService;

	public Test(UserTestService userTestService) {
		super();
		this.userTestService = userTestService;
	}

	@RequestMapping("showUsersTest")
	@ResponseBody
	public List<UserTestPojo> showUsersTest() {
		return userTestService.selectUsers();
	}

}
