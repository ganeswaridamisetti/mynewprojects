package com.arrays;

public class demo2 {

	public static void main(String[] args) {
		byte[] ages;
		ages = new byte[10];
		System.out.println(ages);
		ages[0] = 22;
		ages[1] = 22;
		ages[2] = 22;
		ages[3] = 22;
		ages[4] = 22;
		ages[5] = 22;
		ages[6] = 22;
		ages[7] = 22;
		ages[8] = 22;
		ages[9] = 22;
		for (byte i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
	}

}
