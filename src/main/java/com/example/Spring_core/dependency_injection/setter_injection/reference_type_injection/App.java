package com.example.Spring_core.dependency_injection.setter_injection.reference_type_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/Spring_core/dependency_injection/setter_injection/reference_type_injection/config.xml");
		
		DependentClass dependentClass = context.getBean("dependent1",DependentClass.class);
		System.out.println(dependentClass.getX());
		System.out.println(dependentClass.getDependency().getY());
		System.out.println(dependentClass);
	}
}
