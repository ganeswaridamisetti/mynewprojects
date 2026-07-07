package com.File.oi.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Testdemo7 {

	public static void main(String[] args) throws IOException {
		System.out.println("main");
		//true este append avuthundhii
FileWriter fw= new FileWriter("C:\\Users\\anjal\\OneDrive\\Desktop\\javatest\\ganeswari2.txt");
fw.write(65);
fw.write('\n');
fw.write("have a nice day");
fw.write('\n');
fw.write("have a good day");
fw.write('\n');
fw.write("have a nice day");
fw.write('\n');
//refresh avadam kosam
fw.flush();
fw.close();
	}

}
