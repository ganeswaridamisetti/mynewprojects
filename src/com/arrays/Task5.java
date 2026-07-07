package com.arrays;

public class Task5 {

	public static void main(String[] args) {
int[] arr= {1,2,4,5,7,10};
int max=arr[arr.length-1];//10      
for(int i=1;i<max;i++) {
	boolean status=false;
	for(int j=0;j<arr.length;j++) {
		if(arr[j]==i) {
			status=true;
			break;
		}
	}
	if(!status) {
		System.out.println(i+" ");
	}
}
	}

}
