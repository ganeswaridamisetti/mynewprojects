package com.oops.inheritance;

class Bank {
    void bankDetails() {
        System.out.println("Bank Name: SBI");
    }
}

class SavingsAccount extends Bank {
    void interestRate() {
        System.out.println("Interest Rate: 6%");
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();

        s.bankDetails();
        s.interestRate();
    }
}