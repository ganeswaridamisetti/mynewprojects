package com.exceptionhandling;

import java.util.Scanner;

public class TestDemoEH2 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		long a= sc.nextLong();
		System.out.println("enter b value :");
		long b= sc.nextLong();
		try {
			System.out.println("try block");
		System.out.println(a/b);
		} catch(ArithmeticException ae) {
			System.err.println("catch block");
			ae.printStackTrace();
		}finally {
			System.out.println("finally block");
		}
		System.out.println("main method ended ");
	}

}
