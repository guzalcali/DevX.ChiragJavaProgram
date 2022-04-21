package com.java_demo.class07;

// Take a price from user and print discount value based on price

// less than 100 then print - No Discount
// less than 500 then print - 5%
// less than 1000 then print - 10%
// more than or equal to 1000 then print - 15%

import java.util.Scanner;

public class PrintDiscountBasedOnPrice {
    public static void main(String[] args) {
        System.out.println("Please input the price: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 100) {
            System.out.println(" No Discount ");
        } else if (num < 500) {
            System.out.println(" 5% Discount ");
        } else if (num < 1000) {
            System.out.println("10% Discount ");
        } else if (num >= 1000) {
            System.out.println("15% Discount ");
        } else {
            System.out.println("Invalid input, please enter from 0-10000 only");

        }
    }
}
