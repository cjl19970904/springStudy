package cjl.spring.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
	public void testAop(){
		System.out.println("order aop -----OrderService");
	}
	public OrderService() {
		System.out.println("orderService start");
	}
}
