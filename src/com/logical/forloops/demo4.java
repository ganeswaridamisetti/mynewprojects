package com.logical.forloops;
//WAP to print factorial of given numbers table using methods...?
import java.util.Scanner;

public class demo4 {
	static int findfact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int n = sc.nextInt();
		int f = findfact(n);
		System.out.println("the factorial value is:" + f);
		sc.close();
	}

}
