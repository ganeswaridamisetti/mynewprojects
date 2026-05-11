package com.logical.forloops;

import java.util.Scanner;

public class demo10 {
	static int add(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int n = sc.nextInt();
		int s = add(n);
		sc.close();
		System.out.println("the value of sum is:" + s);
	}

}
