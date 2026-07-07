package com.File.oi.stream;

import java.io.File;
import java.io.IOException;

public class Testdemo3 {

	public static void main(String[] args) throws IOException {
System.out.println("main");
File f=new File("C:\\\\Users\\\\anjal\\\\OneDrive\\\\Desktop\\\\javatest\\gani");
File f1= new File(f,"hello.txt");
f1.createNewFile();
System.out.println(f.isDirectory());
System.out.println(f.isFile());
System.out.println(f.getAbsoluteFile());//its return file
System.out.println(f.getAbsolutePath());//its return string
System.out.println(f.getCanonicalPath());//its return string
System.out.println(f.getCanonicalFile());//its return file
//space entha free space undhoo
System.out.println(f.getFreeSpace());
//total entha undhoo
System.out.println(f.getTotalSpace());
//entha usable spacee
System.out.println(f.getUsableSpace());
//boolean status=f.mkdir();
//
//if(status) {
//	System.out.println("directory has been create sucessfully");
//}else
//	System.out.println("something went wrongg");
//{
//	}

}
}