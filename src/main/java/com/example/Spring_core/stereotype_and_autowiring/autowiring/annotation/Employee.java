package com.example.Spring_core.stereotype_and_autowiring.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Autowired
	private Address address;
	
	public Employee() {}

//	@Autowired	//constructor injection
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor");

	}

	public Address getAddress() {
		return address;
	}

//	@Autowired	//setter injection
	public void setAddress(Address address) {
		System.out.println("Inside setter method");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
