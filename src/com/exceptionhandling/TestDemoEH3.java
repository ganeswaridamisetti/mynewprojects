package com.exceptionhandling;

public class TestDemoEH3 {

	public static void main(String[] args) {
System.out.println("main Started");
//String s=null;
String s="Srikanth";
try {
	System.out.println(s.length());
	//String out of bound Exception
	System.out.println(s.charAt(10));
}catch(NullPointerException ne){
	System.err.println("catch block");
	ne.printStackTrace();
}
System.out.println("main method ended");
	}

}
