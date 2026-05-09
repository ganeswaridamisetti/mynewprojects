package com.fundmentconstructors;

class Vehicle {
	String brand;

	Vehicle(String brand) {
		this.brand = brand;
		System.out.println("brand:" + brand);
	}

}

class Car1 extends Vehicle {
	double price;

	Car1(String brand, double price) {
		super(brand);
		this.price = price;
		System.out.println("price:" + price);

	}
}

public class Electroniccar extends Car1 {
	String battery;

	Electroniccar(String brand, double price, String battery) {
		super(brand, price);
		this.battery = battery;
		System.out.println("battery:" + battery);

	}

	public static void main(String[] args) {

		Electroniccar e1 = new Electroniccar("suzuki", 1200000, "amaran");
	}

}
