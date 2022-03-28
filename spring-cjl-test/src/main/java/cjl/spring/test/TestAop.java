package cjl.spring.test;

import cjl.spring.app.AppConfig;
import cjl.spring.service1.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//		AopTestInterface bean = ac.getBean(AopTestInterface.class);
	}
}
