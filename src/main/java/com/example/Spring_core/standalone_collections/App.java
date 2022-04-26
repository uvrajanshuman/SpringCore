package com.example.Spring_core.standalone_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/Spring_core/standalone_collections/config.xml");
		
		Person person1 = context.getBean("person1", Person.class);
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName()+" : "+person1.getFriends());
		System.out.println(person1.getCourseFees().getClass().getName()+" : "+person1.getCourseFees());
		System.out.println(person1.getProperties().getClass().getName()+" : "+person1.getProperties());

	}
}
