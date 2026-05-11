package com.logical.forloops;
//WAP to print multiplication for given numbers...?
import java.util.Scanner;

public class demo7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		int mul=1;
		for(int i=1;i<=n;i++) {
			mul=mul*i;
		}
System.out.println("the multiplication value is:"+mul);
sc.close();
	}

}
