package com.example.Spring_core.Java_configuration.bean_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//	Dependent Bean without annotation
public class DependentClass {
	private DependencyClass dependency;
	private int y;

	public DependentClass() {
		super();
	}

	public DependentClass(DependencyClass dependency, int y) {
		super();
		this.dependency = dependency;
		this.y = y;
	}

	public DependencyClass getDependency() {
		return dependency;
	}


	public void setDependency(DependencyClass dependency) {
		this.dependency = dependency;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "DependentClass [dependency=" + dependency + ", y=" + y + "]";
	}
	
}
