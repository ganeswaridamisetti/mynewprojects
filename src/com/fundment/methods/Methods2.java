package com.fundment.methods;

public class Methods2 {
	//no return type+no arguments
static void add() {
int a=20;
int b=15;
System.out.println(a+b);
}
static void sub() {
int a=20;
int b=15;
System.out.println(a-b);
}
static void mul() {
int a=20;
int b=15;
System.out.println(a*b);
}
static void div() {
int a=20;
int b=5;
System.out.println(a/b);
}
static void mod() {
int a=20;
int b=5;
System.out.println(a%b);
}
//no return type+with arguments
static void add1(int a,int b) {
System.out.println(a+b);
}
	public static void main(String[] args) {
add();
sub();
mul();
div();
mod();
//call by value
add1(200,500);
	}

}
