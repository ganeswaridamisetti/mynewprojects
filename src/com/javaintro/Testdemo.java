package com.javaintro;

public class Testdemo {
	static {
		
		method1();
Testdemo t = new Testdemo();
t.method2();
	}
	static void method1()
	{
		System.out.println("this is method1");
method3();

		
	}
void method2() {
	System.out.println("this is method2");
	method4();
	
}
static void method3()
{
	System.out.println("this is method3");
	
}
void method4() {
System.out.println("this is method4");

}
	public static void main(String[] args) {
		System.out.println("main method start");
	
		System.out.println("main method ended");
		

	}

}
