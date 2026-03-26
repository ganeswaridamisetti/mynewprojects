package com.javaintro;

public class Object {
	static void method1() {
		System.out.println("methods are in static block");
	
	}
	void method2() {
		System.out.println("methods are in instence block");

		
	}

	public static void main(String[] args) {
		System.out.println("hellooo");
		Object o1=new Object();
		method1();
		
o1.method2();
	}

}
