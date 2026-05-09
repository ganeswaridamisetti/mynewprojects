package com.fundmentconstructors;

public class Example {
	int eid;
	String ename;

	Example(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

	

}

class Example2 extends Example {
	Example2(int eid, String ename) {
		super(eid, ename);

	}
	public static void main(String[] args) {

	

	Example2 e1 = new Example2(101, "gani");
}
}