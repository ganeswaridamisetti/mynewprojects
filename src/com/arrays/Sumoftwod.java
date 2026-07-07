package com.arrays;

public class Sumoftwod {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
//		int[][] arr = new int[3][3];
//		arr[0][0] = 2;
//		arr[0][1] = 1;
//		arr[0][2] = 1;
//		arr[1][0] = 3;
//		arr[1][1] = 5;
//		arr[1][2] = 6;
//		arr[2][0] = 7;
//		arr[2][1] = 5;
//		arr[2][2] = 4;
int sum = 0;
//		for (int[] arr1 : arr) {
//			for (int a : arr1) {
//				sum = sum + a;
//
//			}
//		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
		}
		System.out.println(sum);
	}

}
