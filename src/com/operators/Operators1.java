package com.operators;
//Arithmetic operators(+,-,*,/,%)
//BODMAS
public class Operators1 {

	public static void main(String[] args) {
int a=500;
int b=200;
		
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
  