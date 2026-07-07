package com.oops.mol.mor;

public class MolDemo3 {

	 void main() {
addition();
addition(30);
addition(10,50);
	}
	void addition() {
		System.out.println("no-arg ");
	}
	void addition(int a) {
		System.out.println("one argument");
		System.out.println(a+100);
	}
	void addition(int a,int b) {
		System.out.println("two arguments ");
		System.out.println(a+b);
	}
	//The method addition(float, int) is ambiguous for the type MolDemo3
	//ela different data types unappudu int and float or float and int unappudu deniki vellali ani confusion(ambiguity) vastundhi
	void addition(float f1,int f2) {
		System.out.println("two arguments ");
		System.out.println(f1+f2);
	}
	void addition(int f1,float f2) {
		System.out.println("two arguments ");
		System.out.println(f1+f2);
	}
}
