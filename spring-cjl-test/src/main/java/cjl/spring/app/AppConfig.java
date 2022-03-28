package cjl.spring.app;

import cjl.spring.beanDefinition.CustomAopBeanPostProcessor;
import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan("cjl.spring")
@EnableAspectJAutoProxy
//@ImportResource("classpath:spring.xml")
//@Import(CustomAopBeanPostProcessor.class)
public class AppConfig {

	/**
	 * 创建对象的方式：{
	 *     自己创建------new 构造方法
	 *     别人创建------方法-----
	 * }
	 */

	/*@Bean
	public A a(){
		System.out.println("a init");
		return new A();
	}@Bean
	public B b(){
		a();
		System.out.println("b init");
		return new B();
	}*/
/*	@PostConstruct
	public String a (){
		return "11";
	}*/
}
