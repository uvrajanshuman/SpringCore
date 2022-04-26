package com.example.Spring_core.Java_configuration.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//	Driver class
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		DependentClass ob1 = context.getBean("dep",DependentClass.class);
		System.out.println(ob1);
	}
}
