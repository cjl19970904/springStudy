package cjl.spring.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	@Autowired
	OrderService orderService;
	public UserService() {
		System.out.println("userService start");
	}
}
