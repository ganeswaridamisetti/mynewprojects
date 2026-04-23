package com.fundment.accessmodifer1;

public class Testdemo1 {
	private int age;
	private String name;
	private Testdemo1(){
		System.out.println("private no-arg constructor");
		
	}

	public static void main(String[] args) {
Testdemo1 t1=new Testdemo1();
System.out.println(t1.age);
System.out.println(t1.name);
	}

}
