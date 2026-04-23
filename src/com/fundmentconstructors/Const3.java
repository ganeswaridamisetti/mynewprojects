package com.fundmentconstructors;

public class Const3 {
	int eid;
	String ename;

	Const3() {
		System.out.println("no-arg constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method started!");
		Const3 c3 = new Const3();
		System.out.println(c3.eid);
		System.out.println(c3.ename);
		System.out.println("main method ended!");

	}

}
