package com.File.oi.stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Testdemo6 {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("C:\\Users\\anjal\\OneDrive\\Desktop\\javatest\\ganeswari1.txt");
BufferedReader br=new BufferedReader(fr);
String line=br.readLine();
//its reading line by line not single a character
while(line != null) {
	System.out.println(line);
	line=br.readLine();
	Thread.sleep(500);
}
br.close();
fr.close();
	}

}
