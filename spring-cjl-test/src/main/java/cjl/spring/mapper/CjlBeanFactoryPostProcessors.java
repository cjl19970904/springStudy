package cjl.spring.mapper;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class CjlBeanFactoryPostProcessors implements BeanFactoryPostProcessor {
	/**
	 * 扫描完成之后 parse put Map 之后
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
	/*	GenericBeanDefinition cjlService =(GenericBeanDefinition) beanFactory.getBeanDefinition("cjlService");
		cjlService.setBeanClass(TestService.class);*/
	}
}
