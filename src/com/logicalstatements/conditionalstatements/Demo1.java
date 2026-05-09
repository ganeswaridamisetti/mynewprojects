package com.logicalstatements.conditionalstatements;

import java.util.Scanner;
//when ever is condition is then only if block will executed
public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
if(age>18) 
{
	System.out.println("congratulations!!");
	System.out.println("you are eligiable for voting");
}
	}

}
