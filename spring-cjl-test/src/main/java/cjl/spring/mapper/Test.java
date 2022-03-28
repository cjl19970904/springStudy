package cjl.spring.mapper;

import org.apache.ibatis.javassist.runtime.Inner;

import java.lang.reflect.Constructor;

public class Test {
	InnerTest innerTest = new InnerTest();

	class InnerTest{
		public InnerTest(){}
	}

	public static void main(String[] args) {
		Test test =new Test();
		int i = 0;
		Constructor<?>[] constructors = InnerTest.class.getConstructors();
		for (Constructor<?> constructor : InnerTest.class.getConstructors()) {
			for (Class<?> parameterType : constructor.getParameterTypes()) {
				System.out.println("-----------------"+i);
				System.out.println(parameterType);
			}
			i++;
		}
		System.out.println(111);
	}
}
