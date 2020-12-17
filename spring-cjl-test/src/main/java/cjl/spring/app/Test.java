package cjl.spring.app;

import org.springframework.cglib.proxy.Enhancer;

public class Test {
	public static void main(String[] args) throws IllegalAccessException, InstantiationException {
		Enhancer enhancer = new Enhancer();
		//设置一个父类
		enhancer.setSuperclass(A.class);
		enhancer.setCallback(new MyMethodInterceptor());
		enhancer.setUseFactory(false);
//		enhancer.setCallbackType(MyMethodInterceptor.class);
		A a = (A) enhancer.create();
//		System.out.println(a);
		a.cglibMethod();
	}
}
