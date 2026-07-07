package com.File.oi.stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Testdemo8 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method");
		FileWriter fw= new FileWriter("C:\\Users\\anjal\\OneDrive\\Desktop\\javatest\\ganeswari2.txt");
		
BufferedWriter bw=new BufferedWriter(fw);
bw.write(65);
bw.write("chill");
bw.newLine();
bw.write("have a nice day,good morning guys");
bw.newLine();
bw.flush();
bw.close();
fw.close();

	}

}
