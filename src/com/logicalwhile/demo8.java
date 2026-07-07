package com.logicalwhile;

import java.util.Scanner;
//the given number is armstrong or not.....?
public class demo8 {
	static boolean isarmstg(int n) {
		boolean status = false;
		int r = 0;
		int temp = n;
		int sump = 0;
		String str = Integer.toString(n);
		int nLen = str.length();
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			// sump=sump+(r*r*r);
			sump = (int) (sump + Math.pow(r, nLen));
		}
		if (temp == sump) {
			status = true;
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter anumber");
		int n = sc.nextInt();
		boolean status = isarmstg(n);
		if (status) {
			System.out.println("yes!! given number is armstrong number");
		} else {
			System.out.println("no!! given number is not a armstrong number");
		}
	}

}
