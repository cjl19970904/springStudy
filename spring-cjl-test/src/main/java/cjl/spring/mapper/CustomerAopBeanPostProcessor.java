package cjl.spring.mapper;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomerAopBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
/*		if (bean instanceof UserService){
			bean = CglibUtils.getProxy();
		}*/
		return bean;
	}
}
