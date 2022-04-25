package com.example.Spring_core.dependency_injection.setter_injection.collection_data_type_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/Spring_core/dependency_injection/setter_injection/collection_data_type_injection/config.xml");
		
		Employee emp1 = context.getBean("employee1",Employee.class);
		System.out.println(emp1.getName().getClass().getName()+" : "+emp1.getName());
		System.out.println(emp1.getPhones().getClass().getName()+" : "+emp1.getPhones());
		System.out.println(emp1.getAddress().getClass().getName()+" : "+emp1.getAddress());
		System.out.println(emp1.getCourses().getClass().getName()+" : "+emp1.getCourses());
		System.out.println(emp1.getProperties().getClass().getName()+" : "+emp1.getProperties());
	}
}
