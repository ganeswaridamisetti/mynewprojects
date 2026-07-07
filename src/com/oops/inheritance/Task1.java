package com.oops.inheritance;

class Person {
	int age;
	String name;
    void displayDetails() {
        System.out.println("Student name :"+name);
        System.out.println("Student age :"+age);
    }
}

class Student extends Person {
	int rollno;
    void studentinfo() {
        System.out.println("Student Roll number :"+rollno);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Student s = new Student();
s.name="ganeswari";
s.age=21;
s.rollno=123;
System.out.println("student details");
        s.displayDetails();
        s.studentinfo();
    }
}