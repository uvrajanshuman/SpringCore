package com.example.Spring_core.bean_scope;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/example/Spring_core/bean_scope/config.xml");
		
		DependentClass ob1 = context.getBean("dependentClass", DependentClass.class);
		DependentClass ob2 = context.getBean("dependentClass", DependentClass.class);
		
		System.out.println(ob1);
		System.out.println(ob2);
		
		/*
		 * Different dependency provided but same main class
		 */
		System.out.println(ob1.getDependency());
		System.out.println(ob2.getDependency());
		
	}
}
