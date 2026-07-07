package com.File.oi.stream;

import java.io.File;
import java.io.IOException;

public class TestDemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("main started");
File f= new File("C:\\Users\\anjal\\OneDrive\\Desktop\\javatest\\ganeswari2.txt");
//Atomically creates a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist. The check for the existence of the file and the creation of the file if it does not exist are a single operation that is atomic with respect to all other filesystem activities that might affect the file.
boolean status =f.createNewFile();
if(status) {
	System.out.println("file has been created suceccessfull");
}else {
	System.out.println("something went wrong file already exist");
}
//f.delete();
boolean isexists=f.exists();
//if(!isexists) {
//	f.createNewFile();
//	System.out.println("the file create sucessfully");
//}
//else {
//	System.out.println("the file already exist");
//}

	}

}
