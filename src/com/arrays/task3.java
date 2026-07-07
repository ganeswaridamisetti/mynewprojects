package com.arrays;

public class task3 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
int[] arr2=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			//index value equal to i avithe sum avalii
			if (i == 0) {
				arr2[i] = arr[i] + arr[i + 1];
				//last ki reach avadaniki arr.length-1
			} else if (i == arr.length - 1) {
				arr2[i] = arr[i] + arr[i - 1];

			} else {
				//dani mundhudhi kakunda venakadhi ravadam kosam 
				arr2[i] = arr[i - 1] + arr[i + 1];

			}
		}
		for (int a : arr2) {
			System.out.println(a + " ");
		}
	}

}
