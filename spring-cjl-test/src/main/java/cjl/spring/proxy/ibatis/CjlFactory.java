package cjl.spring.proxy.ibatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class CjlFactory {
	public static Object getMapper(Class clazz) {
		/**
		 * JDK 动态代理
		 *ClassLoader loader, //类加载器 动态加载一个类
		 *Class<?>[] interfaces,//
		 *InvocationHandler h
		 */
		Class[] classes = new Class[] {clazz};
		Object o  = Proxy.newProxyInstance(CjlFactory.class.getClassLoader(),classes,new CjlInvocationHandler());
		return o;
	}
}
