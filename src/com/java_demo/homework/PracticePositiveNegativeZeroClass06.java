package com.java_demo.homework;

import java.util.Scanner;

public class PracticePositiveNegativeZeroClass06 {
    public static void main(String[] args) {
        System.out.println("Please enter any whole number");

        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();

        if (numA > 0) {
            System.out.println(numA + " is positive");
        } else if (numA == 0) {
            System.out.println("Your number is zero / 0");
        } else if (numA < 0) {
            System.out.println(numA + " is negative");
        } else {
            System.out.println("Please enter only allowed value as instructed above"); // could not correctly
        }                                   //account for instances on decimals for above statement - does not work
        System.out.println("End");
    }
}
