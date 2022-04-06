package cjl.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class IndexService {
	@Autowired
	UserService userService;

	private String name;
	private String aa;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void shutdown() {
		System.out.println("close");
	}

	public void getService() {
		System.out.println(userService);
	}

	public IndexService() {
		System.out.println("indexService constr");
	}

	@PostConstruct
	public void init() {
		System.out.println("indexService init");
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
