package com.spring.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserService implements InitializingBean, ApplicationContextAware {
//	@Value("#{testS}")
	@Autowired
	private TestService service;
	private String name;

	public TestService getService() {
		return service;
	}

	public void setService(TestService service) {
		this.service = service;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void test(){
	   System.out.println(service);
   }

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("初始化");
	}
@PostConstruct
	public void initxxx(){
		System.out.println("初始化xxxx");
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("applicationContextAware");
	}
}
