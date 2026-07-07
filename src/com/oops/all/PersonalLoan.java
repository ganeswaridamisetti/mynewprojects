package com.oops.all;

//import java.util.Scanner;

public class PersonalLoan extends Loan {
	 void getpersonalloaninfo(){
	System.out.println("your are all documents are verified ..");
}
	public static void main(String[] args) {
		System.out.println("Vcube Software Solutions Personal Loan");
		PersonalLoan pl=new PersonalLoan();
		double salary=pl.getcustomersalary();
		int cibil=pl.getcibilscore();
		int age=pl.getcustomerage();
		System.out.println("enter aadhar details :");
		String aadhar=sc.next();
		System.out.println("enter pan number :");
		String pan=sc.next();
		System.out.println("enter phone number :");
		String phone=sc.next();
		if(salary>=1000000.00 &&
				(cibil>=300 && cibil<=900) && 
				age>=25 && pl.validateaadhar(aadhar) &&
				pl.validatepan(pan) && 
				pl.validtephone(phone)  ){
			System.out.println("congratulations..!!");
			System.out.println("you are eligible for personal loan..!!!");
			System.out.println("your loan rate of intrest is :"+pl.roiinfo());
			System.out.println("enter your address details :");
			String address=pl.getAddress();
			System.out.println("customer address is :"+address);
			pl.getpersonalloaninfo();
		}else {
			System.out.println("you are not eligible for personal loan..");
		}
	}

}
