package com.logicalwhile;

import java.util.Scanner;
//WAP to print reverse of the given number..?
public class demo6 {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
int rev=reversenum(n);
	System.out.println("the revesrse number is:"+rev);

	}
	static int reversenum(int n) {
		int rev=0;
		int r=0;
		while(n>0) {
			r=n%10;//123%10-->3,12%10-->2,1%10-->1
			n=n/10;//123/10-->12,12/10-->1,1/10-->0
			rev=rev*10+r;//0*10+3=3,3*10+2=32,32*10+1=321
		}
		return rev;
	}


}
