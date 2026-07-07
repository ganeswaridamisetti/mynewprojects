package com.exceptionhandling;

import java.util.Scanner;

public class TestDemoExecption {

	public static void main(String[] args) {
		System.out.println("main method started ");
Scanner sc=new Scanner(System.in);
System.out.println("enter a number :");
long a= sc.nextLong();
System.out.println("enter b value :");
long b= sc.nextLong();
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at com.exceptionhandling.TestDemoExecption.main(TestDemoExecption.java:14)
///This is abnormal termination when the exception is coming not execute remaining
///  code that is the problem this problem to overcome to grace full termination
System.out.println(a/b);
System.out.println("main method ended ");
	}

}
