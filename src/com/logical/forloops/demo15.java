package com.logical.forloops;

import java.util.Scanner;

public class demo15 {
	static boolean iseven(int n) {
		if(n==0) {
			return true;
		}
		if(n==1) {
			return false;
		}
		return iseven(n-2);
		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");{
			int n=sc.nextInt();
			boolean eve=iseven(n);
			if(eve) {
				System.out.println("it is even number");
				
			}else {
				System.out.println("it is not a even number");
			}
		
		}

	}

}
