package com.oops.inheritance;

class Bank1 {
    void bankDetails() {
        System.out.println("Bank Details");
    }
}

class Account extends Bank {
    void accountDetails() {
        System.out.println("Account Details");
    }
}

class SavingsAccoun extends Account {
    void interestRate() {
        System.out.println("Interest Rate: 6%");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        SavingsAccoun s = new SavingsAccoun();

        s.bankDetails();
        s.accountDetails();
        s.interestRate();
    }
}