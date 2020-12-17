package com.spring.test;

import com.spring.app.AppConfig;
import com.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = (UserService) applicationContext.getBean("userService");
		System.out.println(userService.getName());
		System.out.println(userService);
		System.out.println("test注入====="+userService.getService());
	}
}
