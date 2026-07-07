package com.logicalwhile;

import java.util.Scanner;

public class demo12 {

	static void decimaltobinary(int n) {
		int r = 0;
		int dn=0;
		int base=1;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			dn =dn+(r*base);
			base=base*2;
		}
		System.out.println("converting decimal to binary is:" + dn);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		decimaltobinary(n);}

}
