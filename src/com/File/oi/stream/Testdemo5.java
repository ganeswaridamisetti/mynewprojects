package com.File.oi.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//file reader
public class Testdemo5 {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
//constructor 
		FileReader fr=new FileReader("C:\\Users\\anjal\\OneDrive\\Desktop\\javatest\\ganeswari1.txt");
		//ela constructor ni call chesinappudu kuda error vache chance undhi kabbati can you please throws filenotfoundexception chesam compiler satisfaction kosam
		//read method int ni return chestundhi .
		//reads a single character
	int i=fr.read();//71
	///drawback ente ante single character ni read cheyadam dani kosam introduce chesaru bufferreader
		while(i!=-1) {
			System.out.print((char)i);
			 i=fr.read();
			 Thread.sleep(500);
		}
		
		fr.close();
		
	}

}
