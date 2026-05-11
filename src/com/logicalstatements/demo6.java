package com.logicalstatements;

import java.util.Scanner;

//wap to print the result based on the symbol 
//like if my symbol is +-->addition
//like if my symbol is - -->subtraction
public class demo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("calculation process");
		String yn="";
		do {
			System.out.println("enter a number-1");
			int num1 =sc.nextInt();
			System.out.println("enter a number-2");
			int num2=sc.nextInt();
			System.out.println("enter a symbol like + - * / %");
			String symb=sc.next();
			double result=0;
			//switch cannot take boolean expression and double
			//boolean status= True;
			//Cannot switch on a value of type double.
			//Only convertible int values, strings or enum variables are permitted
			//double height=5.5;
			switch(symb) {
			case "+"-> result=num1+num2;
			case "-"-> result=num1-num2;
			case "*"-> result=num1*num2;
			case "/"-> result=num1/num2;
			case "%"-> result=num1%num2;
			
		default->System.out.println("unkown symbol");
						
			}
			System.out.println("result is"+result);
			System.out.println("do you want to continue click y for yes n for no");
			yn=sc.next();
			//ignoring the case sencitive
			}while(yn.equalsIgnoreCase("y"));

	}

}
