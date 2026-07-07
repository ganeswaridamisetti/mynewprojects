package com.oops.mol.mor;

public class PersonalLoan extends Loan {
	//Rule:1 method signature must be same
	@Override
	double roiinfo() {
		return 8.5;
	}
	//Rule:2 method return type must be same until 1.4 version but 1.5 version onwards java introduced co-varient return type.
	//co-varient return means the parent class method returns any object data type the child can returns are object data type or it's sub type.
	@Override
	Integer cibilinfo() {
		return 100;
	}
	//Rule:3 method scope should not reduce
	public static void main(String[] args) {
PersonalLoan pl=new PersonalLoan();
System.out.println(pl.roiinfo());
System.out.println(pl.cibilinfo());
	}

}
