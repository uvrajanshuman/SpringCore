package com.example.Spring_core.dependency_injection.setter_injection.reference_type_injection;

public class DependencyClass {
	private int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "DependencyClass [y=" + y + "]";
	}
	
	
}
