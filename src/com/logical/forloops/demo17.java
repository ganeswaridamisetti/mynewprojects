package com.logical.forloops;

import java.util.Scanner;

public class demo17 {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter how many values to print");
		//int n=sc.nextInt();
		int n1=0;
		int n2=1;
		for (int i=5;i<50;i++) {
			 i=n1+n2;
			 if(i>=5&&i<50)
			System.out.print( "  " + i);
			n1=n2;
			n2=i;
		}
	}

}
