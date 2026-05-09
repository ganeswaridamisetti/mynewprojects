package com.fundmentconstructors;

public class Const6 {
	int id;
	String name;
	Const6(){
		System.out.println("no args");
	}
	Const6(int id,String name){
		this.id=id;
		this.name=name;
		System.out.println("parametrized");
	}

	public static void main(String[] args) {

	}
	
}
class Child1 extends Const6{
	Child1(){
		super(1,"gani");
		System.out.println("child no-args");
	}
	public static void main(String[] args) {
	Child1 c1=new Child1();
	
	}
}
