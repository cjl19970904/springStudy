package cjl.spring.beanDefinition;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

//@DependsOn("aaa")
@Component
public class BeanService {
	String name;
	Integer age;

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
}
