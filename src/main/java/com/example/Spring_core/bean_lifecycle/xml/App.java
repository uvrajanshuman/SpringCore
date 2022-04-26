package com.example.Spring_core.bean_lifecycle.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/example/Spring_core/bean_lifecycle/xml/config.xml");
		
		// Registering shutdown hook
		context.registerShutdownHook();
		
		LifeCycleExample ex = context.getBean("example1",LifeCycleExample.class);
		System.out.println(ex);
	}
}
