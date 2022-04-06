package cjl.spring.test;

import cjl.spring.app.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(/*AppConfig.class*/);
		ac.register(AppConfig.class);
//
		ac.addBeanFactoryPostProcessor(new CjlBeanPostProcessor());
		ac.refresh();
		System.out.println(ac.getBeanDefinition("a").getClass());

//		System.out.println(ac.getBean(AppConfig.class));
//		System.out.println(ac.getBean(A.class));

	}
}
