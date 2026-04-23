package com.fundmentconstructors;

public class Const5 {
	int eid;
	String ename;
	int age;

	// no-arg constructor
	Const5() {
		System.out.println("this is no-args");
	}

	// Parameterized constructor
	Const5(int eid, String ename,int age) {
		this.eid = eid;
		this.ename = ename;
		this.age = age;
		System.out.println("parametrized constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method started!");
		Const5 c1 = new Const5(72, "tilak",27);
		c1.show();
		Const5 c3 = new Const5(33, "hardik",32);
		c3.show();
		Const5 c4 = new Const5(45, "rohit sharma",42);
		c4.show();
		Const5 c2 = new Const5();
	}

	void show() {
		System.out.println("jersy no:" + eid);
		System.out.println("name of crickter: " + ename);
		System.out.println("age:" + age);
	}
}
