package com.spring.test;

import com.spring.app.AppConfig;
import com.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		System.out.println(applicationContext.getBean("testS"));
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.test();
	}
}
