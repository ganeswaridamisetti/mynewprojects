package com.fundment.methods;

public class Method7 {

	public static void main(String[] args) {
		System.out.println("main method started");
		double sal=salary();
		double bou=bonus();
		System.out.println("the total is"+(sal+bou));

	}
static double salary() {
	double salary=2000000.00;
	return salary;
	
}
static double bonus() {
	double bonus=2000.00;
	return bonus;
}
}
