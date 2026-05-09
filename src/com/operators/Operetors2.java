package com.operators;

import java.util.Scanner;

//Arithmetic operators(+,-,*,/,%)
//BODMAS
public class Operetors2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
int a=sc.nextInt();
System.out.println("enter b value");
int b=sc.nextInt();
		
//+a+b can consider as string then print 500200
System.out.println("addition of sum:"+a+b);//500200
System.out.println("addition of sum:"+(a+b));
//The operator - is undefined for the argument type(s) String, int
//System.out.println("addition of sum:"+a-b);
System.out.println("subtraction of diff:"+(a-b));
System.out.println("multiply of product:"+a*b);
System.out.println("division of quocient:"+a/b);
System.out.println("modulos of reminder:"+a%b);

	}

}
  