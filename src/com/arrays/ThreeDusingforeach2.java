package com.arrays;

public class ThreeDusingforeach2 {

	public static void main(String[] args) {
		int[][][] arr=new int[3][3][3];
		arr[0][0][0]=1;
		arr[1][1][1]=2;
		arr[2][2][2]=3;
		for(int[][] arr2:arr) {
			for(int[] arr1:arr2) {
				for(int a:arr1) {
					System.out.print(a+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
