package com.arrays;

public class minoddnumber {

	public static void main(String[] args) {
int[] arr= {2,3,4,5,6,7,8,9,10};
int minodd=arr[1];
for(int i=0;i<arr.length;i++) {
	if(arr[i]%2!=0 && arr[i]<minodd) {
		//2%2!=0&&3>2
		//
		minodd=arr[i];
		//3
			}
}
System.out.println("minimum odd number is:  "+minodd);

	}

}
