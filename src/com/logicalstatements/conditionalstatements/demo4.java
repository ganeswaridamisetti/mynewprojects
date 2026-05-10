package com.logicalstatements.conditionalstatements;

import java.util.Scanner;

//WAP to find grade of the student based on his percantage of marks..?/*
public class demo4 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter your marks percentage");
double marksp=sc.nextDouble();
if(marksp > 100 || marksp < 0) {
	System.out.println("invalid marks percentage");
}
else if(marksp >90) {
	System.out.println("grade A");
}
else if(marksp >80) {
	System.out.println("grade B");
}
else if(marksp >70) {
	System.out.println("grade C");
}
else if(marksp >60) {
	System.out.println("grade D");
}

else if(marksp >35) {
	System.out.println("just passed");
}



else {
	System.out.println("failed!!");
}
	}

}
