package com.example.Spring_core.stereotype_and_autowiring.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	//injecting value directly
	@Value("Yuvraj")
	private String studentName;
	
	//injecting value directly
	@Value("SMI")
	private String city;
	
	//injecting value from xml config file
	@Value("#{sub}")
	private List<String> subjects;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", subjects=" + subjects + "]";
	}
	
	
}
