package cjl.spring.test;

import cjl.spring.app.AppConfig;
import cjl.spring.service.CjlService;
import cjl.spring.service.IndexService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);

//		AbstractBeanDefinition abstractBeanDefinition = new GenericBeanDefinition();
//		abstractBeanDefinition.setBeanClass(CjlService.class);
//		abstractBeanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
		/**
		 * 模板
		 */
		RootBeanDefinition rootBeanDefinition =new RootBeanDefinition();
		rootBeanDefinition.getPropertyValues().add("name","cjl");
//		rootBeanDefinition.setBeanClass(CjlService.class);
		rootBeanDefinition.setAbstract(true);

		ChildBeanDefinition childBeanDefinition=new ChildBeanDefinition("cjlService");
		childBeanDefinition.setBeanClass(IndexService.class);
		ac.registerBeanDefinition("cjlService",rootBeanDefinition);
		ac.registerBeanDefinition("indexService",childBeanDefinition);

		ac.refresh();
//		System.out.println(ac.getBean(CjlService.class));
		System.out.println(ac.getBean(IndexService.class));
	}
}
