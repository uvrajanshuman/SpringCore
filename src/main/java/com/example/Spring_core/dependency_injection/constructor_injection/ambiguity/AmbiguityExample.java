package com.example.Spring_core.dependency_injection.constructor_injection.ambiguity;

public class AmbiguityExample {
	private int a;
	private int b;
	
	public AmbiguityExample(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor: int int");
	}
	
	public AmbiguityExample(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor: double double");
	}
	
	public AmbiguityExample(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor: String String");
	}
	
	public void doSum() {
		System.out.println("a: "+a+" b:"+b+"; a+b="+(a+b));
	}
}
