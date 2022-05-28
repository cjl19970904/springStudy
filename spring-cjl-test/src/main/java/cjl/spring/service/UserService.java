package cjl.spring.service;

import cjl.spring.util.CglibUtils;
import org.springframework.stereotype.Component;

//@Component
public class UserService/* implements AopTestInterface*/ {

	public void testAop(){
		System.out.println("testAop1 .....UserService");
	}
	public String testAopStr(String arg){
		System.out.println("testAopStr");
		return arg;
	}
}
