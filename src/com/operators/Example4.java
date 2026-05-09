package com.operators;

public class Example4 {
	int a = 10;
	int b = 20;

	int addition() {
		int c = a + b;
		return c;
	}

	int subtraction() {
		int c1 = a - b;
		return c1;
	}

	int multiplicatin() {
		int c3 = a * b;
		return c3;
	}

	int division() {
		int c4 = a / b;
		return c4;
	}

	int modulos() {
		int c5 = a % b;
		return c5;
	}

	public static void main(String[] args) {
		Example4 e=new Example4();
		int a = e.addition();
		int b =e.subtraction();
		int c = e.multiplicatin();
		int d= e.division();
		int f =e.modulos();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
	}

}
