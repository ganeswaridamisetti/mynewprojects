package com.arrayssortings;

import java.util.Arrays;

public class insertionSort {

	public static void main(String[] args) {
int[] arr= {6,34,2,4,87,1};
for(int i=0;i<arr.length;i++) {
	int temp=arr[i];
	int j=i;
	while(j>0&&arr[j-1]>temp) {
		arr[j]=arr[j-1];
		j--;
	}
	arr[j]=temp;
}
System.out.println(Arrays.toString(arr));
	}

}
