package com.logical.forloops;

public class demo16 {
	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		for (int i=3;i<=10;i++) {
			int n3=n1+n2;
			 n1=n2;
				n2=n3;
			 if(i==10) {
				 System.out.print( n3);
			
		}
	}
	}
}
