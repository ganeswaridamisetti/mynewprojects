package com.logicalstatements.conditionalstatements;

import java.util.Scanner;

//WAP to work with a simple matrimonial related info validation check?
public class demo5 {

	public static void main(String[] args) {
		System.out.println("welcom to vcube matrimonial validation");
Scanner sc = new Scanner(System.in);
System.out.println("enter your name");
String name =sc.nextLine();
System.out.println("welcome Mr."+name);
System.out.println("enter your assets & salary information");
double assets=sc.nextDouble();
System.out.println("enter your salary information");
double salary=sc.nextDouble();

if(assets >=500000000.00 && salary >= 2500000.00) {
	System.out.println("oh great!! will continue the discussion");
	System.out.println("enter your age");
	int age =sc.nextInt();
	if(age >26 && age <=30) {
	System.out.println("your age is matching with our profile");
	System.out.println("enter your weigth and hright");
	float height=sc.nextFloat();
	
	
	if(height >5.4f && height<=5.9f) {
		System.out.println("ok to continue");
		System.out.println("enter your weigth");
		double weight =sc.nextDouble();
		if(weight >=62 && weight <=72) {
			System.out.println("okk good to go");
		System.out.println("do you have any siblings");
		boolean siblings=sc.nextBoolean();
		if(siblings) {
			System.out.println("we are communicate later");
		}
		else {
			System.out.println("omg we connect later");
		}
		}
		else {
			System.out.println("you must need to join GYM");
		}
	}
	else {
		System.out.println("you are to short or to long");
	}
	}
	else {
		System.out.println("your AGE ID DOESNOT match our profile");
	}

}
else {
		System.out.println("you can leave for the day");
	
}
	}

}
