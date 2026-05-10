package com.logicalstatements.conditionalstatements;

import java.util.Scanner;
//note:if we can write individully but else we cannot write without if.
public class demo3 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("are you attending classes regularly");
boolean areyouattendingclasses=sc.nextBoolean();
System.out.println("are you attending classes regularly");
boolean areyouattendingassignments=sc.nextBoolean();
System.out.println("are you attending classes regularly");
boolean areyouattendingmockups=sc.nextBoolean();
if(areyouattendingclasses && areyouattendingassignments &&areyouattendingmockups) {
	System.out.println("good!! you will get a high chances to get job in 6 months");
	
}
else {
	System.out.println("god will save you !!");
}
	}

}
