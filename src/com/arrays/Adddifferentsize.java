package com.arrays;

public class Adddifferentsize {

	public static void main(String[] args) {
int[] arr1= {1,2,3,4,5};
int[] arr2= {1,2,7};
int maxlength=Math.max(arr1.length,arr2.length);
int[] arr3=new int[maxlength];
for(int i=0;i<maxlength;i++) {
	if(i<arr1.length && i<arr2.length) {
		arr3[i]=arr1[i]+arr2[i];
		
	}
	else if(i<arr1.length){
		arr3[i]=arr1[i];
		
		
	}
//	else {
//		arr3[i]=arr2[i];
//	}
}
for(int i=0;i<arr3.length;i++) {
	System.out.print(arr3[i]+" ");
}
    }
	}


