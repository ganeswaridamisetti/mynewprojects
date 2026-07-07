package com.oops.encapsulation;

public class Bank2 {

	public static void main(String[] args) {
Bank b1=new Bank();
b1.setBalance(1);
b1.deposit(13000);
b1.withdrawl(100);
b1.withdrawl(1500);
System.out.println("current balance is: "+b1.getBalance());
	}

}
