package com.fundment.methods;

public class Methods1 {
	static void method1() {
		System.out.println("this is static method!");	
	}
	void method2() {
		System.out.println("this is instance method!");
	}

	public static void main(String[] args) {
System.out.println("main started");
Methods1 m1=new Methods1();
m1.method2();
method1();
System.out.println("main ended");
	}

}
