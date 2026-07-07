package com.logicalwhile;

import java.util.Scanner;

//the given number is palindrome or not...?
public class demo7 {
	static boolean ispalin(int n) {
		boolean status = false;
		int sump = 0;
		int r = 0;
		int temp = n;
		while (n > 0) {
			r = n % 10;// 123%10-->3,12%10-->2,1%10-->1
			n = n / 10;// 123/10-->12,12/10-->1,1/10-->0
			sump = sump * 10 + r;// 0*10+3=3,3*10+2=32,32*10+1=321
		}
		if (temp == sump) {
			status = true;
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		boolean status = ispalin(n);
		if (status) {
			System.out.println("yes !! it is a palindrome...");
		} else {
			System.out.println("no !! it is not a palindrome...");
		}
	}

}
