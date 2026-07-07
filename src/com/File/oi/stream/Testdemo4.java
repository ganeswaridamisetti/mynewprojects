package com.File.oi.stream;

import java.io.File;

public class Testdemo4 {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\anjal\\OneDrive\\Desktop");
		File[] files = f.listFiles();
		int directcount = 0;
		int filecount = 0;
		int misscount = 0;
		for (File file : files) {
			if (file.isDirectory()) {
				directcount++;
			} else if (file.isFile()) {

				filecount++;
			} else {
				misscount++;
			}
		}
		System.out.println(directcount);
		System.out.println(filecount);
		System.out.println(misscount);

		// File f=new File("C:\\Downloads")
//array of string ni return chestundhii
//String[] names = f.list();
//int count=0;
//for(String name:names) {
//	System.out.println(name);
//	count++;
//}
//System.out.println(count);
	}
}
