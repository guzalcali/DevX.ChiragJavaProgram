package com.java_demo.class06;

import java.util.Scanner;
// Write a program to check given number is positive, negative ,or zero
public class PositiveNegativeZero {
    public static void main(String[] args) {
        System.out.println("Enter any number");

        //Input
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();

        if (Num > 0) {
            System.out.println("Given number is positive");
        } else if (Num < 0) {
            System.out.println("Given number is negative");
        } else {
            System.out.println("Given number is zero");
            // Output
        }
    }
}

