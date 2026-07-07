package com.logical.forloops;

import java.util.Scanner;

public class demo12 {
static boolean isperft(int n) {
	boolean status=false;
	int sum=0;
	for(int i=1;i<=n/2;i++) {
		if(n%i==0) {
			sum=sum+i;
		}
	}
	if(sum==n) {
		status=true;
	}
	return status;
}
	public static void main(String[] args) {
System.out.println("main");
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
boolean flag=isperft(n);
if(flag) {
	System.out.println("the given number is perfect");
}else {
	System.out.println("the given number is not perfect");
}
	}

}
