package com.arrayssortings;

public class Arrbubblesorts {

	public static void main(String[] args) {
int[] arr= {18,45,33,72,7,1};
System.out.println("before sorting");
for(int a:arr) {
	System.out.print(a+" ");
}
int temp=0;
for(int i=0;i<arr.length-1;i++) {
	for(int j=0;j<arr.length-1-i;j++) {
		if(arr[j]>arr[j+1]) {
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
	}
}
System.out.println("\nafter sorting");
for(int a:arr) {
	System.out.print(a+" ");
}
	}

}
