package com.arrays;

import java.util.Scanner;

public class arrprime2 {
	static boolean isprime(int n) {
		boolean status=true;
		if(n==0||n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				status=false;
				break;
			}
			
		}
		return status;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int size=sc.nextInt();
	int[] number=new int[size];
	System.out.println("read the values of console:");
      
	for(int i=0;i<size;i++) {
		number[i]=sc.nextInt();
	}
	System.out.println("representing the values");
	for(int i=0;i<size;i++) {
		if(isprime(number[i])) {
			System.out.println(number[i]+"");
		}
	}
	
	}
}
