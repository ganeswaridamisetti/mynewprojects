package com.javaintro;

public class Student1 {
int id=519;
String name="ganeswari";
int marks=90;
String subject="java";
	public static void main(String[] args) {
		System.out.println("main started");
		Student1 s1=new Student1();
		s1.method1();
				System.out.println("main ended");
	}
void method1() {

	
	System.out.println(id);
	System.out.println(name);
	System.out.println(marks);
	System.out.println(subject);

}
}
