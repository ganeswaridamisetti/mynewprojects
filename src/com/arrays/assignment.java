package com.arrays;

public class assignment {

	    public static void main(String[] args) {

	        int[] arr = {1, 0, 2, 4, 5, 0, 9, 0, 6};
	        

	        int j = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != 0) {
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	                j++;
	            }
	        }

	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}
