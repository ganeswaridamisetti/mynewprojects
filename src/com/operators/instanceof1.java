package com.operators;
class A{
	
}
class B extends A{
	
}

public class instanceof1 {

	public static void main(String[] args) {
Integer i1=20;
System.out.println(i1 instanceof Integer);
//nub=mber is instanceof object calss
System.out.println(i1 instanceof Number);
System.out.println(i1 instanceof Object);
System.out.println(null instanceof Integer);//false
Object obj =new Object();
//object is achildren of string
System.out.println(obj instanceof String);//f(object is parent of every one)

Integer i2=20;
//ncompatible conditional operand types Integer and String
//System.out.println(i2 instanceof String);
System.out.println("**********************************");
A a=new A();
B b=new B();
System.out.println(a instanceof A);
System.out.println(b instanceof B);
System.out.println(b instanceof A);
System.out.println(a instanceof B);
	}

}
