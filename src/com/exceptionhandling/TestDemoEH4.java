package com.exceptionhandling;

public class TestDemoEH4 {
	public static void main(String[] args) {
		
	
	System.out.println("main Started");
	String s="Srikanth";
	try {
		//String out of bound Exception
		System.out.println(s.charAt(10));
	}catch(StringIndexOutOfBoundsException se){
		System.err.println("catch block");
		se.printStackTrace();
	}
	System.out.println("main method ended");
}
}
