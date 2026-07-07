package com.arrays;

public class Slidingwindow {

	static void main() {
		int[] users = { 2, 1, 5, 1, 3, 2 };
		int k = 3;
		int windowsum = 0;
		int max = 0;
		for (int i = 0; i < k; i++) {
			windowsum = windowsum + users[i];
		}
		for (int i = 1; i < users.length - k; i++) {
			windowsum = windowsum - users[i - 1] + users[i + k - 1];

		}
		System.out.println("total windows is : " + windowsum);

		if (windowsum > max) {
			max = windowsum;
		}
		System.out.println("maximum is :" + max);

	}
}
