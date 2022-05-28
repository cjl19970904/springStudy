package cjl.spring.beanDefinition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserService {
/*
	@Autowired
	OrderService orderService;
*/
	public UserService() {
		System.out.println("start userService");
	}
	@PostConstruct
	public void init(){
		System.out.println("userService init ");
	}

	public void testAop() {
		System.out.println("testAop-----------");
	}
}
