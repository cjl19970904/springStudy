package cjl.spring.postprocessor;

import cjl.spring.service1.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class CjlBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition userService=(GenericBeanDefinition) beanFactory.getBeanDefinition("userService");
		userService.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
	}
}
