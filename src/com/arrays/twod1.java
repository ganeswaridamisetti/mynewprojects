package com.arrays;

public class twod1 {

	public static void main(String[] args) {
int [][] arr=new int[3][3];
arr[0][0]=23;
arr[0][1]=24;
arr[0][2]=25;
arr[1][0]=26;
arr[1][1]=27;
arr[1][2]=28;
arr[2][0]=29;
arr[2][1]=20;
arr[2][2]=21;
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		System.out.print(arr[i][j] +" ");
		
	}
	System.out.println();
	
}

	}
	

}
