package com.logical.forloops;
//WAP to print multiplication table using methods...?
import java.util.Scanner;

public class demo6 {
	static void findmul(int n,int n1) {
		for(int i=1;i<=n1;i++) {
			System.out.println(n + "x" + i + "=" + (n*i));
		}
		//return n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of starting procces");
		int n=sc.nextInt();
		System.out.println("enter the value of where we want to print  ");
		int n1=sc.nextInt();
		//int fa=findmul(n,n1);
		findmul(n,n1);
		//System.out.println(fa);
		sc.close();
	}
	
	}


