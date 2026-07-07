package com.arrays;

public class joogeedarray {

	public static void main(String[] args) {
int[][] n=new int[2][];
n[0] =new int[3];
n[1] =new int[3];
n[0][0]=23;
n[0][1]=24;
n[0][2]=25;
n[1][0]=26;
n[1][1]=27;
n[1][2]=28;

for(int i=0;i<n.length;i++) {
	for(int j=0;j<n[i].length;j++) {
		System.out.print(n[i][j]+" ");
	}
	System.out.println();
}
	}

}
