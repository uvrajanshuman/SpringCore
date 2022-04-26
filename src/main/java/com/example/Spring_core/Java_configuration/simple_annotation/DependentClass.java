package com.example.Spring_core.Java_configuration.simple_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//	Dependent Bean
@Component
public class DependentClass {
	@Autowired
	private DependencyClass dependency;
	
	@Value("20")
	private int y;

	@Override
	public String toString() {
		return "DependentClass [dependency=" + dependency + ", y=" + y + "]";
	}
	
}
