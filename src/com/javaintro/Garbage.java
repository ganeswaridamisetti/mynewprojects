package com.javaintro;

class Customer {
	@Override
	protected void finalize() {
		System.out.println("this is finalize");
	}
}

public class Garbage {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
	c1=null;
	c3=c2;
	new Customer();
		System.out.println(c1);//@1dbd16a6
System.out.println(c2);//@7ad041f3	
System.out.println(c3);
System.gc();
}

}
