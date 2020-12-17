package cjl.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
@Component
public class IndexService {
	private  String name;
	private String aa;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void shutdown(){
		System.out.println("close");
	}
}
