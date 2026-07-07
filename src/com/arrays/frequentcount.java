package com.arrays;

import java.util.Scanner;

public class frequentcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
		int search=sc.nextInt();
		int[] arr= {23,2,2,23,15,15,72,72,72};
		int count=0;
		for(int a:arr) {
			if(a==search) {
				count++;
			}
		}
		System.out.println("counting numbers are: "+count);
	}

}
