package com.logicalstatements;

import java.util.Scanner;

// wap to print weekly description based on week..?
public class demo4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
System.out.println("enter a week info");
String week=sc.next().toUpperCase();
switch(week) {
case "mon"->
	System.out.println("monday is always lazy day");
	
case "tues" ,"wed","thurs","fri"->
	System.out.println("these are routine days");

case "sat","sun"->
	System.out.println("holidays and entertinement days");
default -> System.out.println("not avialableeeee");

}
		sc.close();
	}

}
