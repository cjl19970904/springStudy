package cjl.spring.beanDefinition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service("aaa")
public class IndexService {

//	public IndexService(BeanService beanService) {
//		System.out.println(beanService);
//	}
String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
