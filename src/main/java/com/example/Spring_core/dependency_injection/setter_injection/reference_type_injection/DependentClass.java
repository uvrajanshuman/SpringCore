package com.example.Spring_core.dependency_injection.setter_injection.reference_type_injection;

public class DependentClass {
	private int x;
	private DependencyClass dependency;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public DependencyClass getDependency() {
		return dependency;
	}
	public void setDependency(DependencyClass dependency) {
		this.dependency = dependency;
	}
	
	@Override
	public String toString() {
		return "DependentClass [x=" + x + ", dependency=" + dependency + "]";
	}         
}
