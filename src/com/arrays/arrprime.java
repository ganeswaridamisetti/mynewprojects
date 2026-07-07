package com.arrays;

//import java.util.Scanner;

public class arrprime {
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
	int[] arr= {5,12,13,17,23};
	for(int i=0;i<arr.length;i++) {
		if(isprime(arr[i])) {
			System.out.println("the prime numbers are:"+arr[i]);
		}
	}
	}

}
