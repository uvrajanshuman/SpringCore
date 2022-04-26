package com.example.Spring_core.bean_lifecycle.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleExample {
	private int x;
	
	@PostConstruct
	public void init() {
		System.out.println("Inside init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
	/*
	 * The name of init() and destroy() can be anything, it should just
	 * match the signature; and the name used here needs to be specified
	 * in the configuration file.
	 */

	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("Setting the value of x");
		this.x = x;
	}

	@Override
	public String toString() {
		return "LifeCycleExample [x=" + x + "]";
	}
	
	
}
