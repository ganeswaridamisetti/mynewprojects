package com.logicalwhile;

import java.util.Scanner;

public class demo11 {
	static void decimaltobinary(int n) {
		int r = 0;
		String bn = "";
		while (n > 0) {
			r = n % 2;
			n = n / 2;
			bn = r + " " + bn;
		}
		System.out.println("converting decimal to binary is:" + bn);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		decimaltobinary(n);
	}

}
