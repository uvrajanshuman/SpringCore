package com.example.Spring_core.stereotype_and_autowiring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/Spring_core/stereotype_and_autowiring/stereotype/config.xml");
		
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
	}
}
