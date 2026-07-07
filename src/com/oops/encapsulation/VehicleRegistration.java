package com.oops.encapsulation;

public class VehicleRegistration {

	public static void main(String[] args) {
		Vehiclereg v1=new Vehiclereg();
		System.err.println("*********************************");
		v1.setVid(2319);
		v1.setVname("AUDI");
		v1.setVownername("ganeswari");
		System.out.println(v1.getVid());
		System.out.println(v1.getVname());
		System.out.println(v1.getVownername());
		System.err.println("*********************************");
		Vehiclereg v2=new Vehiclereg();
		v2.setVid(231901);
		v2.setVname("rolls royal");
		v2.setVownername("rama");
		System.out.println(v2.getVid());
		System.out.println(v2.getVname());
		System.out.println(v2.getVownername());
		System.err.println("*********************************");
		Vehiclereg v3=new Vehiclereg();
		v3.setVid(1901);
		v3.setVname("benz");
		v3.setVownername("anjali");
		System.out.println(v3.getVid());
		System.out.println(v3.getVname());
		System.out.println(v3.getVownername());
		System.err.println("*********************************");
		
	}

}
