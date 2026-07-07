package com.oops.encapsulation;
 class Bank {
	private double balance;

	public double getBalance() {
		return balance;
	}
public void setBalance(double balance) {
	if(balance>=1) {
		this.balance = balance;
	}else
		System.out.println("negative values are not aollow");
		
	}
public void deposit(double amount) {
	if(amount>0) {//untene add chestunnam
		balance +=amount;//balance ki add cheyalii amount ni
		System.out.println("diposit is: "+amount);
	}else
	{
		System.out.println("invalid amount ");
	}
	
	
}
public void withdrawl(double amount) {
	if(amount<=0 || amount > balance) {
		System.out.println("invalid : ");
	}
	else {
		balance -=amount;
		System.out.println("withdrawl : "+amount);
	}
}
	

	

}
