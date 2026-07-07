package com.arrays;

public class Task4 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 7, 10 };
		for (int i = 0; i < arr.length; i++) {
			int current = arr[i];
			int next = arr[i + 1];
			for (int j = current + 1; j < next; j++) {
				System.out.println(j + " ");
			}

		}

	}

}
