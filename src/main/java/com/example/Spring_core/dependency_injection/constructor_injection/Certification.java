package com.example.Spring_core.dependency_injection.constructor_injection;

public class Certification {
	private String name;

	public Certification(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certification [name=" + name + "]";
	}
	
}
