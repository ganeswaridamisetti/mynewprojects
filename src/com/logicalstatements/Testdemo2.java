package com.logicalstatements;

import java.util.Scanner;

public class Testdemo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalBill = 0;

        // Pizza Variables
        String pizzaName = "";
        int pizzaPrice = 0;
        int pizzaQty = 0;

        // Burger Variables
        String burgerName = "";
        int burgerPrice = 0;
        int burgerQty = 0;

        // Drinks Variables
        String drinkName = "";
        int drinkPrice = 0;
        int drinkQty = 0;

        // ================= PIZZA =================

        System.out.println("===== PIZZA MENU =====");
        System.out.println("1. Veg Pizza - $8");
        System.out.println("2. Chicken Pizza - $10");

        System.out.print("Enter Pizza Choice: ");
        int pizzaChoice = sc.nextInt();

        switch (pizzaChoice) {

            case 1:
                pizzaName = "Veg Pizza";
                pizzaPrice = 8;
                break;

            case 2:
                pizzaName = "Chicken Pizza";
                pizzaPrice = 10;
                break;

            default:
                System.out.println("Invalid Pizza Choice");
        }

        if (pizzaPrice > 0) {

            System.out.print("Enter Pizza Quantity: ");
            pizzaQty = sc.nextInt();

            totalBill += pizzaPrice * pizzaQty;
        }

        // ================= BURGER =================

        System.out.println("\n===== BURGER MENU =====");
        System.out.println("1. Veg Burger - $5");
        System.out.println("2. Cheese Burger - $7");

        System.out.print("Enter Burger Choice: ");
        int burgerChoice = sc.nextInt();

        switch (burgerChoice) {

            case 1:
                burgerName = "Veg Burger";
                burgerPrice = 5;
                break;

            case 2:
                burgerName = "Cheese Burger";
                burgerPrice = 7;
                break;

            default:
                System.out.println("Invalid Burger Choice");
        }

        if (burgerPrice > 0) {

            System.out.print("Enter Burger Quantity: ");
            burgerQty = sc.nextInt();

            totalBill += burgerPrice * burgerQty;
        }

        // ================= DRINKS =================

        System.out.println("\n===== DRINKS MENU =====");
        System.out.println("1. Coke - $2");
        System.out.println("2. Juice - $3");

        System.out.print("Enter Drink Choice: ");
        int drinkChoice = sc.nextInt();

        switch (drinkChoice) {

            case 1:
                drinkName = "Coke";
                drinkPrice = 2;
                break;

            case 2:
                drinkName = "Juice";
                drinkPrice = 3;
                break;

            default:
                System.out.println("Invalid Drink Choice");
        }

        if (drinkPrice > 0) {

            System.out.print("Enter Drink Quantity: ");
            drinkQty = sc.nextInt();

            totalBill += drinkPrice * drinkQty;
        }

        // ================= FINAL BILL =================

        System.out.println("\n========== FINAL BILL ==========");

        if (pizzaQty > 0) {
            System.out.println(
                pizzaName + " x " + pizzaQty + " = $" + (pizzaPrice * pizzaQty));
        }

        if (burgerQty > 0) {
            System.out.println(
                burgerName + " x " + burgerQty + " = $" + (burgerPrice * burgerQty));
        }

        if (drinkQty > 0) {
            System.out.println(
                drinkName + " x " + drinkQty + " = $" + (drinkPrice * drinkQty));
        }

        System.out.println("--------------------------------");
        System.out.println("Total Bill = $" + totalBill);

        sc.close();
    }
}