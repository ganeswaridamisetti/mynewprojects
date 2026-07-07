package com.arrays.searchings;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a key element :");
		int key = sc.nextInt();

		int index = linearsearch(arr, key);
		System.out.println("index value is :" + index);
		sc.close();
	}

	public static int linearsearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
