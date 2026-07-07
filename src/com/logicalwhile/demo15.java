package com.logicalwhile;

import java.util.Scanner;

public class demo15 {
	static int factorial(int d) {
        int fact = 1;
        for(int i = 1; i <= d; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static boolean isstrong(int n) {
boolean status=false;
        int sum = 0;
        int temp = n;

        while(n > 0) {
            int r = n % 10;       
            sum = sum + factorial(r);
            n = n / 10;              
        }
        if(sum == temp) {
        	status=true;
        }

        return status;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		boolean status = isstrong(n);
		if (status) {
			System.out.println("yes !! this is strong number....");

		} else {
			System.out.println("no!! this is not a strong  number...");
		}

	}

}
