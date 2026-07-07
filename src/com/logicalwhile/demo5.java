package com.logicalwhile;

import java.util.Scanner;

public class demo5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		int fact=1;
		int i=1;
		while(i<n) {
			i++;
			fact=fact*i;
		}
System.out.println("the factorial value is:"+fact);
sc.close();
	}

}
