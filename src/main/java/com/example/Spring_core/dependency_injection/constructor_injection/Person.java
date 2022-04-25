package com.example.Spring_core.dependency_injection.constructor_injection;

import java.util.Set;

public class Person {
	// Primitive data-type injection
	private String name;
	private int personId;
	//	collection injection
	private Set<String> phones;
	// Reference type injection	
	private Certification certification;
	
	public Person(String name, int personId, Set<String> phones, Certification certification) {
		super();
		this.name = name;
		this.personId = personId;
		this.phones = phones;
		this.certification = certification;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", phones=" + phones + ", certification="
				+ certification + "]";
	}
	
}
