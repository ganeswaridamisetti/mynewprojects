package com.arrays.searchings;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		
	
	int[] arr = { 10, 20, 30, 40, 50 };
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a key element :");
	int key = sc.nextInt();

	int index = binarysearch(arr, key);
	System.out.println("index value is :" + index);
	sc.close();
}
	public static int binarysearch(int[] arr,int key) {
	int low=0;int high=arr.length-1;
	while(low<=high) {
		int mid=low+(high-low)/2;
		if(arr[mid]==key) {
			return mid;
		}else if(key<arr[mid]) {
			high=mid-1;
		}else {
			low=mid+1;
		}
	}
	

	return -1;
}
}