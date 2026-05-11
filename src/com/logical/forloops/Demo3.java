package com.logical.forloops;
//WAP to print factorial of given numbers ...?
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
System.out.println("the factorial value is:"+fact);
sc.close();
	}

}
