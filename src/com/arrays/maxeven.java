package com.arrays;

public class maxeven {

	public static void main(String[] args) {
int[] arr= {2,3,4,5,6,7,8,9,10};
int maxeven=0;
for(int i=0;i<arr.length;i++) {
	if(i%2==0 && arr[i]>maxeven) {
		maxeven=arr[i];
			}
}
System.out.println("maximum even number is"+maxeven);

	}

}
