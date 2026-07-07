package com.oops.mol.mor;

public class TestBank {

	public static void main(String[] args) {

		Bank s = new Sbi();
		System.out.println("SBI BANK RATE OF INTREST : "+s.rateOfIntreast());
		Bank h = new Hdfc();

		System.out.println("HDFC BANK RATE OF INTREST : "+h.rateOfIntreast());
		Bank i = new Icic();
		System.out.println("ICIC BANK RATE OF INTREST : "+i.rateOfIntreast());
	}

}
