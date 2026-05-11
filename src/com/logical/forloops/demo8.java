package com.logical.forloops;

import java.util.Scanner;

public class demo8 {
	static int mul(int n) {
		int mul = 1;
		for (int i = 1; i <= n; i++) {
			mul = mul * i;
		}
		return mul;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int n = sc.nextInt();
		int m = mul(n);
		System.out.println("the multiplication value is:" + m);
		sc.close();
	}

}
