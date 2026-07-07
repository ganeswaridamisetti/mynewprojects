package com.logical.forloops;

import java.util.Scanner;

public class demo20 {
	static boolean isprime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;

			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range of the prime number");
		int n = sc.nextInt();
		int count = 0;
		int num = 1;
		boolean status = isprime(n);
		for (; count < n;) {
			num++;
			if (isprime(num)) {
				count++;
			}
		}
		System.out.println(num);
	}

}
