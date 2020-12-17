package cjl.spring.test;

import cjl.spring.app.AppConfig;
import cjl.spring.service.CjlService;
import cjl.spring.service.IndexService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		GenericBeanDefinition gd=new GenericBeanDefinition();
		gd.setBeanClass(IndexService.class);
		gd.setScope("singleton");
		ac.registerBeanDefinition("xx",gd);
//		gd.setAutowireMode(2);
		ac.refresh();
		//容器中拿BeanDefinition ==== BeanDefinition map
		BeanDefinition xx = ac.getBeanDefinition("xx");
		System.out.println(xx);
		/**
		 * spring 容器{
		 *     bean 存在于spring容器中
		 * }
		 * 1.扫描
		 * 2.parse-----beanDefinition object -----map<"xx",o>
		 * 3.验证
		 * map<></>
		 * 4.life-------遍历map 得到BeanDefinition 实例化
		 */
//		System.out.println(ac.getBean(IndexService.class));
		//singletonObjects 单例池 = map
	}
}
