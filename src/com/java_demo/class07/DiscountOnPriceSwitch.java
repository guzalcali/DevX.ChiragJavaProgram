package com.java_demo.class07;

import java.util.Scanner;

public class DiscountOnPriceSwitch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the price to know the discount if any: ");
        int price = sc.nextInt();

        if (price < 100) {
            System.out.println("No discount, sorry");
        } else if (price < 500) {
            System.out.println("5% Discount");
        } else if (price < 1000) {
            System.out.println("10 % Discount");
        } else if (price >= 1000) {
            System.out.println("15 % Discount");
        } else {
            System.out.println("Invalid input, please enter from 0 - 1000 only: ");
        }
    }
}

