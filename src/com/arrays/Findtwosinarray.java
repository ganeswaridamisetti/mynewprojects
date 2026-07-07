package com.arrays;

public class Findtwosinarray {

	public static void main(String[] args) {
int[] arr= {2,23,12,45,222};
int count=0;
 

for(int i=0;i<arr.length;i++) {
	int num=arr[i];
	while(num>0) {
		int digit=num%10;
		num=num/10;
		if(digit==2) {
			count++;
		}
	}
	
	
}
System.out.println("the count of 2's is:"+count);
	}

}
