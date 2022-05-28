package cjl.spring.beanDefinition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class OrderService implements I{
	public OrderService() {
		System.out.println(" start OrderService");
	}
	public void testAop() {
		System.out.println("testAop");
	}
	public String testAopStr(String args){

		System.out.println("testAopStr");
		return args;
	}
}
