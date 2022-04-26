package com.example.Spring_core.bean_lifecycle.Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleExample implements InitializingBean, DisposableBean {
	private int x;
	
	// init() method
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init() method");
		
	}

	// destroy() method
	public void destroy() throws Exception {
		System.out.println("Inside destroy() method");
	}

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
