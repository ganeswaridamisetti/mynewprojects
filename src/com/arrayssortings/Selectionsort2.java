package com.arrayssortings;

public class Selectionsort2 {

	public static void main(String[] args) {
    int[] arr= {10,5,34,23,2,19,15};
    int temp=0;
    for(int i=0;i<arr.length-1;i++) {
    	int minIndex=i;
    	for(int j=i+1;j<arr.length;j++) {
    		
    		if(arr[j]<arr[minIndex]) {
    			minIndex=j;
    			
    		}
    	}
    	temp=arr[i];
		arr[i]=arr[minIndex];
		arr[minIndex]=temp;
    }
    for(int a:arr) {
    	System.out.print(a+" ");
    }
	}

}
