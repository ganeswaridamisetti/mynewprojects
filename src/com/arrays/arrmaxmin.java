package com.arrays;

public class arrmaxmin {

	public static void main(String[] args) {
int[] arr= {10,23,2,4,19,14,15,8};
int max1=arr[0];
int max2=arr[0];
int min1=arr[0];
int min2=arr[0];
for(int i=1;i<arr.length;i++) {
	if(arr[i]>max1) {
		max2=max1;
		max1=arr[i];
	}else if(arr[i]> max2 && arr[i]!=max1) {
		max2=arr[i];
	}
	if(arr[i]<min1) {
		min2=min1;
		min1=arr[i];
	}else if(arr[i]< min2 && arr[i]!=min1) {
		min2=arr[i];
	}
}
System.out.println("second maximum number is:"+max2);
System.out.println("second minimum number is:"+min2);
	}

}
