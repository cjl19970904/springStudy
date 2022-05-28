package cjl.spring.mapper;

import org.springframework.cglib.proxy.Enhancer;

public class Test {
	public static void main(String[] args) throws IllegalAccessException, InstantiationException {

		Enhancer enhancer = new Enhancer();

		//设置一个父类
		enhancer.setSuperclass(E.class);
		enhancer.setCallback(new MyMethodInterceptor());
		enhancer.setUseFactory(false);
		enhancer.setCallbackType(MyMethodInterceptor.class);
//		Class<?> subclass = enhancer.createClass();
		E e = (E) enhancer.create();
		e.cglibMethod();
		//实现了一个接口
		/*enhancer.setInterfaces(new Class<?>[] {EnhancedConfiguration.class});
		//是否实现了工厂
		enhancer.setUseFactory(false);
		//设置名称
		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);

		enhancer.setStrategy(new BeanFactoryAwareGeneratorStrategy(classLoader));
		enhancer.setCallbackFilter(CALLBACK_FILTER);
		enhancer.setCallbackTypes(CALLBACK_FILTER.getCallbackTypes());
		return enhancer;*/
	}
}
