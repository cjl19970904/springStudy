package cjl.spring.beanDefinition;

import cjl.spring.service1.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomAopBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof UserService){
			bean =CglibUtil.getProxy();
		}
		return bean;
	}
}
