package cjl.spring.postprocessor.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.weaver.AjAttribute;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NotVeryUsefulAspect {
	/**
	 * execution：用于匹配方法执行的连接点。这是使用Spring AOP时要使用的主要切入点指示符。
	 *
	 * within：将匹配限制为某些类型内的连接点（使用Spring AOP时，在匹配类型内声明的方法的执行）。
	 *
	 * this：限制匹配到连接点（使用Spring AOP时方法的执行）的匹配，其中bean引用（Spring AOP代理）是给定类型的实例。
	 *
	 * target：在目标对象（代理的应用程序对象）是给定类型的实例的情况下，将匹配限制为连接点（使用Spring AOP时方法的执行）。
	 *
	 * args：在参数为给定类型的实例的情况下，将匹配限制为连接点（使用Spring AOP时方法的执行）。
	 *
	 * @target：在执行对象的类具有给定类型的注释的情况下，将匹配限制为连接点（使用Spring AOP时方法的执行）。
	 *
	 * @args：限制匹配的连接点（使用Spring AOP时方法的执行），其中传递的实际参数的运行时类型具有给定类型的注释。
	 *
	 * @within：将匹配限制为具有给定注释的类型内的连接点（使用Spring AOP时，使用给定注释的类型中声明的方法的执行）。
	 *
	 * @annotation：将匹配点限制为连接点的主题（在Spring AOP中运行的方法）具有给定注释的连接点。
	 */
	/**
	 *  execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern)
	 *                 throws-pattern?)
	 *  modifiers-pattern//方法修饰符
	 *  ret-type-pattern //返回值类型
	 *	declaring-type-pattern 包名
	 *
	 */
	//execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern)
//                throws-pattern?)
/*	@Pointcut("within(cjl.spring.beanDefinition.UserService)")
	public void pointcutWithin(){}*/
	@Pointcut("execution(public * cjl.spring.beanDefinition.*.*(..))")////描述的是这个类下的所有方法
	public void pointcutExecutionAny(){}
	@Pointcut("args(java.lang.String)")
	public void pointcutExecutionArgs(){}
	@Pointcut("within(cjl.spring.beanDefinition.*)")
	public void pointcutWithinAny(){}
	@Pointcut("this(cjl.spring.beanDefinition.OrderService)")
	public void pointcutThis(){}
	@Pointcut("target(cjl.spring.beanDefinition.OrderService)")
	public void pointcutTarget(){}
/*	@Pointcut("within(cjl.spring.beanDefinition.UserService)")
	public void pointcutWithin(){}*/
	@After("pointcutThis()")
	public void doAccessCheck(){
		System.out.println("tx ---------------------");
	}
}
