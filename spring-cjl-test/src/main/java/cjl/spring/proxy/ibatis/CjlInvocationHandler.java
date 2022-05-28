package cjl.spring.proxy.ibatis;//package cjl.spring.proxy.ibatis;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CjlInvocationHandler implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("connection sql db");
		Select annotation = method.getAnnotation(Select.class);
		String sql =annotation.value()[0];
		System.out.println(sql);
//		Class<?> returnType = method.getReturnType();

		return null;
	}
}
