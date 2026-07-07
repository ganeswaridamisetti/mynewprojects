package com.logical.forloops;
//WAP to print factors of given numbers using methods..? 
import java.util.Scanner;

public class demo14 {
	static int factors(int n) {
	//for(int i=1;i<=n/2;i++) {
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			System.out.println(i);
		}
	}
	return n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int n=sc.nextInt();
		int f=factors(n);
		System.out.println("factors of given number is:"+f);
	}

}
