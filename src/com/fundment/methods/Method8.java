package com.fundment.methods;

import java.util.Scanner;

public class Method8 {
	static double simplecal(double amount, double rate, double time) {
		double simple = amount * rate * time / 100;
		return simple;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the ammount");
		double a = sc.nextDouble();
		System.out.println("enter the rate");
		double r = sc.nextDouble();
		System.out.println("enter the time");
		double t = sc.nextDouble();
		double simpleinst = simplecal(a, r, t);
		System.out.println("simple intrest is" + simpleinst);
	}

}
