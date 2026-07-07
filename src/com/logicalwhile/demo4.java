package com.logicalwhile;

public class demo4 {

	public static void main(String[] args) {
		 int evencount = 0;
		int oddcount = 0;
		int i = 1;
//System.out.println("enter a value");
		while( i < 10) {
			i++;
			if (i % 2 == 0) {
				System.out.println(i);
				evencount++;

				 System.out.println("even number is"+evencount);

			}
		}
		System.out.println("*********************************************");
//System.out.println("enter b value");
	int j=1;
		while(j < 10) {
			j++;
			if (j % 2 != 0) {
				System.out.println(j);
				oddcount++;

				System.out.println("odd number is"+oddcount);

			}
		}

	}

}
