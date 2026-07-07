package com.arrays;

public class ThreeDusingforeach {

	public static void main(String[] args) {
		int[][][] arr= {{{1,2,3},{4,5,6},{7,8,9}},
				{{10,20,30},{40,50,60},{70,80,90}},
				{{51,23,14},{19,15,16},{'a','b','c'}}};
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
