package com.logicalwhile;

import java.util.Scanner;

public class demo10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();

int i=1;
while(i<=n/2) {
i++;
if(n%i==0) {
	System.out.println(i);
}


}

System.out.println(n);	
	}

}
