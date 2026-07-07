package com.oops.mol.mor;
//WAP to find area of circle,rectangle,triangle
//circle PI*r*r
//rectangle length*breath
//triangle 0.5*base*height
public class MolDemo4 {

	 void main() {
System.out.println("area of circle : "+findarea(2.3));
System.out.println("area of rectangle : "+findarea(2.3,3.4));
System.out.println("area of triangle : "+findarea(2.3,8.9));
	}
double findarea(double r) {
	return Math.PI*r*r;
}
double findarea(double length,double breath) {
	return length*breath;
}
//same data type undakudadhuu kabatti mol lo arguments pass cheyse tappudu different data type undalii
double findarea(float base,float height) {
	return 0.5*base*height;
	
}

}
