package com.logicalwhile;

import java.util.Scanner;

public class demo9 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
int mul=1;
int i=1;
while(i<=n) {
	
	mul=mul*i;
	i++;
	
	}
System.out.println("multilication is:" +mul);
}
}
