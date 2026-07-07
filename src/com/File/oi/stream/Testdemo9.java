package com.File.oi.stream;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Testdemo9 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main method");
//number este number ravadam kosam use chestam printwriter
		//file lekapothe ade create chestundhii
		PrintWriter pw=new PrintWriter("C:\\Users\\anjal\\OneDrive\\Desktop\\javatest\\sri.txt");
		pw.println("ganeswari");
		pw.println(678);
		pw.println(65);
		pw.println(34.6);
		pw.println('G');
		//printwriter method
		pw.println(pw);
		pw.flush();
		pw.close();
	}

}
