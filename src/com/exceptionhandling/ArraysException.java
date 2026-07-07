package com.exceptionhandling;

public class ArraysException {

	public static void main(String[] args) {
int[] arr=new int[5];
try {
arr[0]=1;
arr[1]=2;
arr[2]=3;
arr[3]=4;
arr[4]=5;
arr[5]=6;
//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//at com.exceptionhandling.ArraysException.main(ArraysException.java:13)
}catch(ArrayIndexOutOfBoundsException ae) {
	System.out.println("catch");
	ae.printStackTrace();
}
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
	}

}
