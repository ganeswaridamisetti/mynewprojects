package com.oops.inheritance;

class Bank2 {
    void bankDetails() {
        System.out.println("Bank Name: SBI");
    }
}

class SavingsAccountt extends Bank {
    void savingsFeature() {
        System.out.println("Savings Account");
    }
}

class CurrentAccount extends Bank {
    void currentFeature() {
        System.out.println("Current Account");
    }
}

public class Hairarical {
    public static void main(String[] args) {

        SavingsAccountt s = new SavingsAccountt();
        s.bankDetails();
        s.savingsFeature();

        CurrentAccount c = new CurrentAccount();
        c.bankDetails();
        c.currentFeature();
    }
}
