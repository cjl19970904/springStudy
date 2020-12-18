package cjl.spring.test;

import cjl.spring.app.A;
import cjl.spring.app.AppConfig;
import cjl.spring.app.CjlScan;
import cjl.spring.beanDefinition.CjlBeanPostProcessor;
import cjl.spring.beanDefinition.CustomScanner;
import cjl.spring.service.IndexService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

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
