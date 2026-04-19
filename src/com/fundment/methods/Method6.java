package com.fundment.methods;

import java.util.Scanner;

public class Method6 {
	//calculate the area of triangle,rectangle,square,circle.
	static double arotrng(double base,double height) {
		double trg=0.5*base*height;
		return trg;
	}
	static double arorec(double length,double breath) {
		double rec=length*breath;
		return rec;
	}
	static double arosq(double side) {
		double sqr=side*side;
		return sqr;
	}
	static double arocrc(double radius) {
		double crc=Math.PI*radius;
		return crc;
	}


	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		//area of triangle
		System.out.println("ehter the base");
		double base=sc.nextDouble();
		System.out.println("ehter the height");
		double height=sc.nextDouble();
		double areaoftriangle=arotrng(base,height);
		System.out.println("area of the triangle is"+ areaoftriangle);
		//area of rectangle
		System.out.println("ehter the length");
		double length=sc.nextDouble();
		System.out.println("ehter the breath");
		double breath=sc.nextDouble();
		double areaofrectangle=arorec(length,breath);
		System.out.println("area of the rectanglr is"+areaofrectangle);
		//area of square
		System.out.println("ehter the side");
		double s=sc.nextDouble();
		double areaofsquare= arosq(s);
		System.out.println("area of the square is"+areaofsquare);
//area of circle
		System.out.println("ehter the radius");
		double r=sc.nextDouble();
		 
		double areaofcircle=arocrc(r);
		System.out.println("area of the circle is"+areaofcircle);
		
	}
}
