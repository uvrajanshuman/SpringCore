package com.example.Spring_core.dependency_injection.setter_injection.primitive_data_type_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/Spring_core/dependency_injection/setter_injection/primitive_data_type_injection/config.xml");
		
		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);
		
		Student student2 = context.getBean("student2",Student.class);
		System.out.println(student2);
	}
}
