package cjl.spring.beanDefinition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.stereotype.Component;

public class Customer extends ClassPathBeanDefinitionScanner {
	public Customer(BeanDefinitionRegistry registry) {
		super(registry);
	}

	@Override
	public void addIncludeFilter(TypeFilter includeFilter) {
		this.addExcludeFilter(includeFilter);
//		super.addIncludeFilter(includeFilter);
	}
}
