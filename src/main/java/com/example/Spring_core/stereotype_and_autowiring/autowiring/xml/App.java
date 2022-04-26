package com.example.Spring_core.stereotype_and_autowiring.autowiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/Spring_core/stereotype_and_autowiring/autowiring/xml/config.xml");
		
		Employee emp1 = context.getBean("emp1",Employee.class);
		System.out.println(emp1);
	}
}
