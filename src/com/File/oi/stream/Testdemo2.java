package com.File.oi.stream;

import java.io.File;
import java.io.IOException;

public class Testdemo2 {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\anjal\\OneDrive\\Desktop\\javatest\\ganeswari1.doc");
		boolean isexists=f.exists();
		if(!isexists) {
			f.createNewFile();
			System.out.println("the file create sucessfully");
		}
		else {
			System.out.println("the file already exist");
		}

	}

}
