package cjl.spring.test;

import cjl.spring.app.AppConfig;
import cjl.spring.service.CjlService;
import cjl.spring.service.IndexService;
import cjl.spring.service.TestService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext(AppConfig.class);
		ac.register(AppConfig.class);

		//元数据
		ac.refresh();
		BeanDefinition cjlService = ac.getBeanDefinition("cjlService");
		System.out.println(cjlService.getSource());
//		System.out.println(ac.getBean(TestService.class));


	}
}
