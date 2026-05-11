package com.logical.forloops;

import java.util.Scanner;

public class demo9 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the value");
int n=sc.nextInt();
int sum=0;
for(int i=0;i<=n;i++) {
	sum=sum+i;
}
sc.close();
System.out.println("the value of sum is:"+sum);
	}

}
