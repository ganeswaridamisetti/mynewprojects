package com.logicalwhile;

import java.util.Scanner;

public class demo13 {
	static boolean isneon(int n) {
		boolean status=false;
		int temp = n;
		int squr = n * n;
		int sum = 0;
		int r = 0;
		while (squr > 0) {
			r = squr % 10;
			sum = sum + r;
			squr = squr / 10;
		}if(sum == temp) {
			status=true;
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		boolean status = isneon(n);
		if (status) {
			System.out.println("yes !! this is neon number....");

		} else {
			System.out.println("no!! this is not neon number...");
		}
	}

}
