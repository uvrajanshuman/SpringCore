package com.example.Spring_core.stereotype_and_autowiring.autowiring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("Temp Street")
	private String street;
	
	@Value("Temp city")
	private String city;
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
}
