package com.fundmentconstructors;

public class Const4 {
	int eid;
	String ename;
	//no-arg constructor
	Const4(){
		System.out.println("this is no-args");
	}
	//Parameterized constructor
	Const4(int ei,String enam){
		eid=ei;
		ename=enam;
		System.out.println("parametrized constructor");
	}

	public static void main(String[] args) {
System.out.println("main method started!");
Const4 c1=new Const4(72, "tilak");
c1.show();
Const4 c2=new Const4();

	}
void show() {
	System.out.println("jersy no:"+eid);
	System.out.println("name of crickter: "+ename);
}
}
