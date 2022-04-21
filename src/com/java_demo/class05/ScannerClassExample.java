package com.java_demo.class05;

import java.util.Scanner;

public class ScannerClassExample {
    // Scanner Class - To get user input in program (from keyboard)
    public static void main(String[] args) {
        System.out.println("Enter any two numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else {
            if (num1 == num2) {
                System.out.println(num1 + " is equal to "+ num2);
            } else {
            System.out.println(num2 + " is greater");
            }
        }
    }
}





