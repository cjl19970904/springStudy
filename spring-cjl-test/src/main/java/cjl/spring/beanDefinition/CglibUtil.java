package cjl.spring.beanDefinition;

import cjl.spring.app.A;
import cjl.spring.app.MyMethodInterceptor;
import cjl.spring.service1.UserService;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibUtil {
	public static Object getProxy(){
		Enhancer enhancer = new Enhancer();
		//设置一个父类
		enhancer.setSuperclass(UserService.class);
		enhancer.setCallback(new MyMethodInterceptor(){
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
				System.out.println("cglib aop ------------");
				Object result = methodProxy.invokeSuper(o,objects);
				return result;
			}
		});
		enhancer.setUseFactory(false);
//		enhancer.setCallbackType(MyMethodInterceptor.class);
		return  enhancer.create();
//		System.out.println(a);
	}
}
