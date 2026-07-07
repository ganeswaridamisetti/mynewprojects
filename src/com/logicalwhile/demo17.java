package com.logicalwhile;

import java.util.Scanner;

public class demo17 {
	static int ishappy(int n) {
		//1 is ahappy number cycle tiragadaniki 4 ni rasukuntam
		while(n!=1&&n!=4) {
		int sum=0;
		while(n>0) {
			int r=n%10;
			n=n/10;
			sum=sum+(r*r);
		}
		//every time number will be restore
		n=sum;
	}
		return n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
int status=ishappy(n);
if(status==1) {
	System.out.println("yes it is happy number");
}else {
	System.out.println("no it is not a happy number");
}
	}

}
