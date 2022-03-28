package cjl.spring.service1;

import cjl.spring.util.CglibUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserService/* implements AopTestInterface*/{

	public void testAop(){
		System.out.println("testAop1 .....UserService");
	}
	public String testAopStr(String arg){
		System.out.println("testAopStr");
		return arg;
	}
	public void testAop1(){
		System.out.println("logic .....");
	}
//	@Autowired(required = false)
	public UserService() {
		System.out.println(" start default");
	}
//	@Autowired(required = false)
	public UserService(OrderService orderService){
		System.out.println("start orderService userService");
	}
//	@Autowired(required = false)
	public UserService(OrderService orderService, CglibUtils cglibUtils){
		System.out.println("start cglibUtils user");
	}
}
