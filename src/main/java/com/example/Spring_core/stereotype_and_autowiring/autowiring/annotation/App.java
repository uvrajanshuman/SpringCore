package com.example.Spring_core.stereotype_and_autowiring.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/Spring_core/stereotype_and_autowiring/autowiring/annotation/config.xml");
		
		Employee emp1 = context.getBean("employee",Employee.class);
		System.out.println(emp1);
	}
}
