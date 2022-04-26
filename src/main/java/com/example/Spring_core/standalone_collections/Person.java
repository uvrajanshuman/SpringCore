package com.example.Spring_core.standalone_collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String, Integer> courseFees;
	private Properties properties;
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Integer> getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(Map<String, Integer> courseFees) {
		this.courseFees = courseFees;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", courseFees=" + courseFees + ", properties=" + properties + "]";
	}
}
