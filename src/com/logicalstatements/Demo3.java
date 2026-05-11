package com.logicalstatements;

import java.util.Scanner;

//WAP to find the cricketers details based on his jersey numbers...?
public class Demo3 {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("enter your jersey number:");
int jno=sc.nextInt();
switch(jno) {
case 33:
	System.out.println("kunfu pandiya");
	System.out.println(" hardik ");
	break;
case 45:
	System.out.println("hitman");
	System.out.println("a  talented batsman");
	System.out.println("rohit sharma");
	break;
case 1:
	System.out.println("KL rahul");
	System.out.println("coolest batsman");
	break;
	default:
		System.out.println("not available in the jersey number");
}


sc.close();
	}

}
