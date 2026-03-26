package com.javaintro;

public class Bank {
	//declaring instance variables
	int accountNumber;
	String accountHolderName;
	int balance;
	//static variables
	static String branch;
	static String bankName;
	public static void main(String[] args) {
System.out.println("welcome to SBI");

branch= "darma reddy colony";
bankName= "State bank of india";
System.out.println("Branch is:"+branch);
System.out.println("bank name is:"+bankName);
Bank b1= new Bank();
b1.accountNumber = 12345;
b1.accountHolderName ="d.ganeswari";
b1.balance = 230000;
System.out.println("Accountnumber is:" +b1.accountNumber);
System.out.println("Accountholder name is:"+b1.accountHolderName);
System.out.println("Balance is:"+b1.balance);
Bank b2= new Bank();
branch= "Pragathi Nagar";
bankName= "HDFC";
System.out.println("Branch is:"+branch);
System.out.println("bank name is:"+bankName);
b2.accountNumber = 54321;
b2.accountHolderName ="R.Bhavani";
b2.balance = 200000;
System.out.println("Accountnumber is:" +b2.accountNumber);
System.out.println("Accountholder name is:"+b2.accountHolderName);
System.out.println("Balance is:"+b2.balance);
Bank b3= new Bank();
branch= "Sri Nagar colony";
bankName= "Reserve bank of india";
System.out.println("Branch is:"+branch);
System.out.println("bank name is:"+bankName);
b3.accountNumber = 89765;
b3.accountHolderName ="A.Gayatri";
b3.balance = 220000;
System.out.println("Accountnumber is:" + b3.accountNumber);
System.out.println("Accountholder name is:"+b3.accountHolderName);
System.out.println("Balance is:"+b3.balance);


	}

}
