package com.operators;

import java.util.Scanner;

//wap for to find aligiable of the user for driving based on the age

public class ternaryopp2 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter your age:");
int age =sc.nextInt();
String  eligiale=(age>18)?"yes eligible for driving":"not eligible for driving";
System.out.println(eligiale);
	}

}
