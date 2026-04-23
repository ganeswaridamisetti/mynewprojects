package com.fundmentconstructors;

public class Constchaining {
	int age;
	String name;
	Constchaining(){
		this(21);
	}
	Constchaining(int age ){
		this(age,"ganeswari");
		
	}
	Constchaining(int age,String name){
		this.age=age;
		this.name=name;
	}
	public static void main(String[] args) {
		Constchaining c1=new Constchaining();
		c1.display();

	}
	void display() {
		System.out.println(+age +"\n"+ name);
	}

}
