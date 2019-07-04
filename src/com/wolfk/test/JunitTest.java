package com.wolfk.test;


import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolfk.pojo.UserTestPojo;
import com.wolfk.service.UserTestService;

public class JunitTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserTestService usersService = (UserTestService) ac.getBean("userTestService");
		List<UserTestPojo> list = usersService.selectUsers();
		for (UserTestPojo u : list) {
			System.out.println(u);
		}
	}

}
