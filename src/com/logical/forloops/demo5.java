package com.logical.forloops;
//WAP to print multiplication table for given numbers...?
import java.util.Scanner;

public class demo5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of starting procces");
		int n=sc.nextInt();
		System.out.println("enter the value of where we want to print  ");
		int n1=sc.nextInt();
		
		for(int i=1;i<=n1;i++) {
			System.out.println(n + "x" + i + "=" + (n*i));
		}
		
	}

}
