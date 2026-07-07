package com.arrays;
//wap to print the array using {}
public class arrtwod2 {

	public static void main(String[] args) {
 int[][] arr= {{12,20,30},{40,50},{60,70,80,90}};
 for(int i=0;i<arr.length;i++) {
	 for(int j=0;j<arr[i].length;j++) {
		 System.out.print(arr[i][j]+" ");
	 }
	 System.out.println();
 }
	}

}
