package com.arrays;

public class ThreeDArr2 {

	public static void main(String[] args) {
		int[][][] arr= {{{1,2,3},{4,5,6},{7,8,9}},
				{{10,20,30},{40,50,60},{70,80,90}},
				{{51,23,14},{19,15,16},{'a','b','c'}}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
