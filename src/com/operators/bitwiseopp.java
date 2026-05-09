package com.operators;

public class bitwiseopp {

	public static void main(String[] args) {
//AND(&)
		System.out.println("************bitwiseand*************");
		System.out.println(45 & 33);//33
System.out.println(68 & 42);//0
System.out.println(68 & 44);//4
System.out.println("************bitwise or*************");
//OR(|)
System.out.println(45 | 33);
System.out.println(68 | 42);
System.out.println(68 | 44);
System.out.println("************bitwise cap*************");
System.out.println(45 ^ 33);
System.out.println(68 ^ 42);
System.out.println(68 ^ 44);
System.out.println("************bitwise Xnor*************");
System.out.println(~33);
	}

}
