package com.arrays;

public class Task7 {
	
	public static void main(String[] args) {
int[] arr= {1,2,4,7,11,15};
int target=15;
boolean found=false;
for(int i=0;i<arr.length;i++) {
for(int j=i+1;j<arr.length;j++) {
	if(arr[i]+arr[j]==target) {
		System.out.println("the pair is : "+arr[i] +" and " +arr[j]);
		found=true;
		break;
	}
}

}
if(!found) {
	System.out.println("the pair is not found...");
}
	
	} 

	}
