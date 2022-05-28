package cjl.spring.util;

import cjl.spring.mapper.E;
import cjl.spring.mapper.MyMethodInterceptor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class CglibUtils {
	public static Object getProxy() {
		Enhancer enhancer = new Enhancer();

		//设置一个父类
		enhancer.setSuperclass(E.class);
		enhancer.setCallback(new MyMethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
				System.out.println("aop  -----------------------");
				Object result = methodProxy.invokeSuper(o,objects);
				return result;
			}
		});
		enhancer.setUseFactory(false);
		enhancer.setCallbackType(MyMethodInterceptor.class);
//		Class<?> subclass = enhancer.createClass();
		return enhancer.create();
	}
}
