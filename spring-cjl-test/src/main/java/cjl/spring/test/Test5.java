package cjl.spring.test;

import cjl.spring.app.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test5 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(/*AppConfig.class*/);
		ac.register(AppConfig.class);

//
		ac.refresh();
		ac.stop();
//		ac.getBean(IndexService.class).getService();
//		System.out.println(ac.getBean(AppConfig.class));
	}
}
