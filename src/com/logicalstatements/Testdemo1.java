package com.logicalstatements;

import java.util.Scanner;

public class Testdemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter catogery:::::");
		String catg = sc.next();//.toLowerCase();
		switch (catg) {
		case "pizza" -> {
			System.out.println("enter the item:");
			String item = sc.next();
			switch (item) {
			case "chicken" -> System.out.println("chicken pizza:299");
			case "veg" -> System.out.println("veg pizza:199");
			default -> System.out.println("entered item is not available");
			}
		}
		case "burger" -> {
			System.out.println("enter the item:");
			String item = sc.next();
			switch (item) {
			case "chicken" -> System.out.println("chicken burgger:299");
			case "veg" -> System.out.println("veg burgger:199");
			default -> System.out.println("entered item is not available");
			}
		}
		case "drinks" -> {
			System.out.println("enter the item:");
			String item = sc.next();
			switch (item) {
			case "cocc" -> System.out.println("cocc drink:99");
			case "juice" -> System.out.println("juice:129");
			default -> System.out.println("entered item is not available");
			}
		}

		}
sc.close();
	}

}
