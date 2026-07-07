package com.oops.inheritance;

class Bank3 {
    void bankDetails() {
        System.out.println("Bank Details");
    }
}

interface Loan {
    void loanDetails();
}

class Customer extends Bank implements Loan {

    public void loanDetails() {
        System.out.println("Education Loan");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Customer c = new Customer();

        c.bankDetails();
        c.loanDetails();
    }
}
