package cjl.spring;

import cjl.spring.app.AppConfig;
import cjl.spring.beanDefinition.I;
import cjl.spring.beanDefinition.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Test1  {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
/*		ac.register(AppConfig.class);
		DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) ac.getBeanFactory();
		beanFactory.setAllowCircularReferences(false);
		ac.refresh();*/
//		System.out.println(ac.getBeanDefinition("e").getClass());
/*		BeanDefinition beanService = ac.getBeanDefinition("beanService");
		System.out.println(beanService.getClass().getSimpleName());*/

//		System.out.println(ac.getBean(UserService.class));
		ac.getBean(I.class).testAop();
		ac.getBean(I.class).testAopStr("cjl");
	}
}
