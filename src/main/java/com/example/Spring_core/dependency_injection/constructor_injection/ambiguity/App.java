package com.example.Spring_core.dependency_injection.constructor_injection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/Spring_core/dependency_injection/constructor_injection/ambiguity/config.xml");
		
		AmbiguityExample ex = context.getBean("example1", AmbiguityExample.class);
		ex.doSum();
	}
}
