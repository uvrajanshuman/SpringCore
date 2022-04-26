package com.example.Spring_core.Java_configuration.bean_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Dependency Bean without annotation
public class DependencyClass {
	private int x;

	public DependencyClass(int x) {
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "DependencyClass [x=" + x + "]";
	}
	
}
