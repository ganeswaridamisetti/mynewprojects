package com.fundment.methods;

import java.util.Scanner;

public class Method5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the price:");
		double price = sc.nextDouble();

		System.out.println("enter the quality:");
		int quality = sc.nextInt();

		System.out.println("enter the delivery charges:");
		double deliverycharges = sc.nextDouble();

		System.out.println("enter the dicount:");
		double discount = sc.nextDouble();

		getOrder(price, quality, deliverycharges, discount);
	}

	static void getOrder(double price, int quality, double deliverycharges, double discount) {
		double total = price * quality;
		double dis = (total * discount) / 100;
		 double total1 = total + deliverycharges - dis;

		System.out.println("total bill:" + total1);
		System.out.println("discount:"+dis);

	}
}
