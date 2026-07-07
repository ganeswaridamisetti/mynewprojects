package com.oops.all;

import java.util.Scanner;

public class Loan {
	static Scanner sc = new Scanner(System.in);
	boolean validateaadhar(String aadhar) {
		//there is a predefined method is matches ede string lo regural expression
		return aadhar.matches("\\d{12}");
	}
	//ABCDE1234D
	boolean validatepan(String pan) {
		return pan.matches("[A-Z]{5}[0-9]{4}[A-z]{1}");
	}
	boolean validtephone(String phone) {
		return phone.matches("[6-9]{1}[0-9]{9}");
	}

	double getcustomersalary() {
		System.out.println("enter your salary :");
		double salary = sc.nextDouble();
		return salary;
	}

	int getcustomerage() {
		System.out.println("enter your age :");
		int age = sc.nextInt();
		return age;
	}

	int getcibilscore() {
		System.out.println("enter your cibil score :");
		int cibil = sc.nextInt();
		return cibil;
	}

	double roiinfo() {
		double roi = 12.0;
		int cibilScore = getcibilscore();
		if (cibilScore >= 300 && cibilScore <= 599) {
			System.out.println("Indicates a history of missed payments;very difficult to get new credit.");
		} else if (cibilScore >= 600 && cibilScore <= 699) {
			System.out.println("Lenders may be hesitant; higher interest rates or collateral might be required.");
		} else if (cibilScore >= 700 && cibilScore <= 749) {
			System.out.println(" Generally acceptable, though some premium rates might apply.");
		} else if (cibilScore >= 750 && cibilScore <= 900) {
			System.out.println(" Ideal range; highly favorable interest rates and quick approvals.");
		} else {
			System.out.println("not eligible for personal loan....!!!!");
		}
		return roi;
	}

	String getAddress() {
		System.out.println("enter your flat number :");
		String flat = sc.next();
		System.out.println("enter your plot number :");
		sc.nextLine();
		String plot = sc.nextLine();
		System.out.println("enter your street name :");
		String street = sc.next();
		System.out.println("enter your city :");
		String city = sc.nextLine();
		System.out.println("enter your pincode :");
		long pin = sc.nextLong();
		System.out.println("enter your State :");
		sc.nextLine();
		String state = sc.next();
		String address = "Flat no :" + flat + 
				",plot number :" + plot +
                ",Street name :" + street + 
                ",city name :" + city+ 
                ",pincode :" + pin + 
                ",state :" + state;
		return address;
	}
	public static void main(String[] args) {

	}

}
