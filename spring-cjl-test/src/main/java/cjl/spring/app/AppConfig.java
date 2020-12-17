package cjl.spring.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("cjl.spring.app")
//@ImportResource("classpath:spring.xml")
public class AppConfig {
	@Bean
	public A a(){
		System.out.println("a init");
		return new A();
	}@Bean
	public B b(){
		a();
		System.out.println("b init");
		return new B();
	}
}
