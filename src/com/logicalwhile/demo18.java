package com.logicalwhile;

import java.util.Scanner;

public class demo18{



			static boolean isprime(int n) {
				boolean status = true;
				if (n == 0 || n == 1) {
					return false;
				}
				for (int i = 2; i < n; i++) {
					if (n % i == 0) {
						status = false;
						break;

					}

				}
				return status;
			}

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the range of the prime number");
				int n = sc.nextInt();
				boolean status = isprime(n);
				for (int i = 0; i <= n; i++) {
					if (isprime(i)) {
						System.out.println(i);	
					}
					
				}
			}





}
