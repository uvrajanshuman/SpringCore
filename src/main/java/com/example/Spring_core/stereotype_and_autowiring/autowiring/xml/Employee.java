package com.example.Spring_core.stereotype_and_autowiring.autowiring.xml;

public class Employee {
	//dependency
	private Address address;
	
	public Employee() {}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
