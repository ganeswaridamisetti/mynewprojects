package com.javaintro;

public class Variables1 {
	int id =10;
	String name="sri";
	final static int orgid=101;
	static String orgname="vcube";
	

	public static void main(String[] args) {
		int x=20;
	
		System.out.println("main started");
		Variables1 v1=new Variables1();
		Variables1 v2 =null;
		System.out.println(v2.orgid);
	
		System.out.println(v1.id);
		System.out.println(v1.name);
		System.out.println(Variables1.orgid);
		System.out.println(orgname);
		System.out.println(x);

	}

}
