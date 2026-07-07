
package com.arrayssortings;

public class Arrbubblesortbestcase {

	public static void main(String[] args) {
int[] arr= {18,45,33,72,7,1};
System.out.println("before sorting");
for(int a:arr) {
	System.out.print(a+" ");
}
int temp=0;
//int count=0;
//int count1=0;
boolean swapped;
for(int i=0;i<arr.length-1;i++) {
	//count++;
	swapped=false;
	for(int j=0;j<arr.length-1-i;j++) {
		//count1++;
		if(arr[j]>arr[j+1]) {
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			swapped=true;
		}
	}
	if(!swapped) {
		break;
	}
}
//System.out.println(count);
//System.out.println(count1);
System.out.println("\nafter sorting");
for(int a:arr) {
	System.out.print(a+" ");
}
	}

}

