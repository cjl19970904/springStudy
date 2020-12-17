package cjl.spring.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class CjlService {
//	public CjlService() {
//		System.out.println("------------");
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	String name;
	Integer age;
}
