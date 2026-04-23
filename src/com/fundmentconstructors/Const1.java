package com.fundmentconstructors;

public class Const1 {
	int price;
	 String brand;

	Const1() {
		 price = 120000;
		brand = "suzuki";
	}

	 void display() {
		System.out.println(price);
		System.out.println(brand);
	}

	public static void main(String[] args) {
		System.out.println("main started");
		Const1 c1 = new Const1();
		c1.display();
		System.out.println("main ended");
	}

}
