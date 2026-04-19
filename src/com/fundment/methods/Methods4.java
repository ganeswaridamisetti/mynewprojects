package com.fundment.methods;

import java.util.Scanner;

public class Methods4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started");
		System.out.println(" enter your name :");

		String name = sc.next();
		meth2(name);

		System.out.println(" enter your age:");

		int age = sc.nextInt();
		meth1(age);
		System.out.println(" enter your height:");

		float height = sc.nextFloat();
		meth3(height);
		System.out.println(" enter your weight :");

		float weight = sc.nextFloat();
		meth4(weight);
		System.out.println(" enter your salary :");

		double salary = sc.nextDouble();
		meth5(salary);

		System.out.println(" enter your mobile number :");

		long phno = sc.nextLong();
		meth6(phno);
		String myfrndname = sc.next();
		meth7(myfrndname);
		System.out.println(" enter your frnd name:");
		String myfathername = sc.next();
		meth8(myfathername);
		System.out.println(" enter your father name:");
		String mymothername = sc.next();
		meth9(mymothername);
		System.out.println(" enter your mother name:");
		String mysistername = sc.next();
		meth10(mysistername);
		System.out.println(" enter your sister name:");
	}

	static void meth2(String name) {
		System.out.println(" my name is:" + name);
	}

	static void meth1(int age) {
		System.out.println("my age is:" + age);
	}

	static void meth3(float height) {
		System.out.println("my height is:" + height);
	}

	static void meth4(float weight) {
		System.out.println("my weight is:" + weight);
	}

	static void meth5(double salary) {
		System.out.println("my salary is:" + salary);
	}

	static void meth6(long phno) {
		System.out.println("my mobile number is:" + phno);
	}

	static void meth7(String myfrndname) {
		System.out.println(" my frnd  name is:" + myfrndname);
	}

	static void meth8(String myfathername) {
		System.out.println(" my father name is:" + myfathername);
	}

	static void meth9(String mymothername) {
		System.out.println(" my father name is:" + mymothername);
	}

	static void meth10(String mysistername) {
		System.out.println(" my sister name is:" + mysistername);
	}

}
