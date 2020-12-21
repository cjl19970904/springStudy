package cjl.spring.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
	@Autowired
	UserService userService;
	public OrderService() {
		System.out.println("orderService start");
	}
}
