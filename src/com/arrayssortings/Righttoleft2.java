package com.arrayssortings;

import java.util.Scanner;

public class Righttoleft2 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		Scanner sc=new Scanner(System.in);
		System.out.println("how many times you want to rotate:");
		int r=sc.nextInt();
		arrayrotation(arr,r);
		
		System.out.println("After sorting");
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
	static void arrayrotation(int[] arr,int r) {
		int start=0;
		int end=arr.length-1;
		arrayreverse(arr,start,end);
		arrayreverse(arr,start,r-1);
		arrayreverse(arr,r,end);
	}
	static void arrayreverse(int[] arr,int start,int end) {
		int temp=0;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
	}
		
	}

