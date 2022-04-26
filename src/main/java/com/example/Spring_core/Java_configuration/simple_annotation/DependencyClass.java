package com.example.Spring_core.Java_configuration.simple_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Dependency Bean
@Component
public class DependencyClass {
	@Value("10")
	private int x;

	@Override
	public String toString() {
		return "DependencyClass [x=" + x + "]";
	}
	
}
