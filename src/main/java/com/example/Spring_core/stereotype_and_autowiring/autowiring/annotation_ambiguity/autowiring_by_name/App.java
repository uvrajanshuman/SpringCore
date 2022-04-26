package com.example.Spring_core.stereotype_and_autowiring.autowiring.annotation_ambiguity.autowiring_by_name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/example/Spring_core/stereotype_and_autowiring/autowiring/annotation_ambiguity/autowiring_by_name/config.xml");
		
		BinarySearch binarySearch = context.getBean("binarySearch", BinarySearch.class);
		int arr[] = new int[] {9, 88, 64, 55, 4, 3, 32, 1};
		int index = binarySearch.search(arr, 55);
		
		System.out.println(index == -1 ? "NOT FOUND" : "FOUND");
	}
}
