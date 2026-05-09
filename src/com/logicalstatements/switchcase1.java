package com.logicalstatements;

import java.util.Scanner;

public class switchcase1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mainChoice, subChoice;
        int totalBill = 0;

        System.out.println("===== Main Menu =====");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Drinks");
        System.out.print("Enter your choice: ");
        mainChoice = sc.nextInt();

        switch (mainChoice) {

            case 1:
                System.out.println("\n--- Pizza Menu ---");
                System.out.println("1. Veg Pizza - $8");
                System.out.println("2. Chicken Pizza - $10");
                System.out.print("Enter your choice: ");
                subChoice = sc.nextInt();

                switch (subChoice) {
                    case 1:
                        System.out.println("You selected Veg Pizza");
                        totalBill = 8;
                        break;

                    case 2:
                        System.out.println("You selected Chicken Pizza");
                        totalBill = 10;
                        break;

                    default:
                        System.out.println("Invalid Pizza choice");
                }
                break;

            case 2:
                System.out.println("\n--- Burger Menu ---");
                System.out.println("1. Veg Burger - $5");
                System.out.println("2. Cheese Burger - $7");
                System.out.print("Enter your choice: ");
                subChoice = sc.nextInt();

                switch (subChoice) {
                    case 1:
                        System.out.println("You selected Veg Burger");
                        totalBill = 5;
                        break;

                    case 2:
                        System.out.println("You selected Cheese Burger");
                        totalBill = 7;
                        break;

                    default:
                        System.out.println("Invalid Burger choice");
                }
                break;

            case 3:
                System.out.println("\n--- Drinks Menu ---");
                System.out.println("1. Coke - $2");
                System.out.println("2. Juice - $3");
                System.out.print("Enter your choice: ");
                subChoice = sc.nextInt();

                switch (subChoice) {
                    case 1:
                        System.out.println("You selected Coke");
                        totalBill = 2;
                        break;

                    case 2:
                        System.out.println("You selected Juice");
                        totalBill = 3;
                        break;

                    default:
                        System.out.println("Invalid Drinks choice");
                }
                break;

            default:
                System.out.println("Invalid Main Menu choice");
        }

        System.out.println("\nTotal Bill = $" + totalBill);

        sc.close();
    }
}
