package cjl.spring.test;

import cjl.spring.app.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 循环注入 study
 */
public class WhileTest {
	public static void main(String[] args) {
		/**
		 * class - bean
		 * 1. 推断构造方法
		 * 2.实例化一个对象
		 * 3.属性注入
		 * 4.执行生命周期回调初始化方法
		 * 5.aop 代理
		 */
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(/*AppConfig.class*/);
		/*DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) ac.getBeanFactory();
		//设置bean 之间是否可以循环引用
		beanFactory.setAllowCircularReferences(false);
*/
		ac.register(AppConfig.class);
		ac.refresh();

		//调用singletonObjects.get("key") ----- 单例bean
//		System.out.println(ac.getBean(OrderService.class));
	}
}
