package com.example.Spring_core.dependency_injection.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/Spring_core/dependency_injection/constructor_injection/config.xml");
		
		Person person1 = context.getBean("person1",Person.class);
		System.out.println(person1);
	}
}
