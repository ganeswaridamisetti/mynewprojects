package com.javaintro;

public class Example2 {
	static String name="SRIKANTH&I";
static {
	System.out.println("static block executed");
}
{
	System.out.println("instance block executed");
}
	 void main() {
System.out.println("main method started");
System.out.println(Example2.name.length());

	}

}
