package com.logicalstatements;

import java.util.Scanner;

//write a program to find tshirt description based on the tshirt size...?
public class demo5 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a tshit size");
int t_shirt= sc.nextInt();
switch(t_shirt) {
//multiple staments rayali ante { }use cheyali
case 38-> System.out.println("the t-shirt size is x-small");
case 39-> System.out.println("the t-shirt size is small");
case 40-> System.out.println("the t-shirt size is medium");
case 42-> System.out.println("the t-shirt size is large");
case 44-> System.out.println("the t-shirt size is extra large");
default->System.out.println("out of stock");
}
	}

}
