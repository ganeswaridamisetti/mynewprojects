package com.oops.mol.mor;

public class MolDemo1 {

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
}
