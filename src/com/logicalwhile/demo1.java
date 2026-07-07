package com.logicalwhile;

import java.util.Scanner;
//sum of the digits
public class demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sum of number");
		int n = sc.nextInt();
		int sum=0;
		int r=0;
		while(n>0) {//21
			r=n%10;//21%10-1/2%10=2
			n=n/10;//21/10-2/2/10=0
			sum=sum+r;
			
		}
		System.out.println("the sum is"+sum);
	}

}
