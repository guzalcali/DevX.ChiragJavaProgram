package com.java_demo.class05;

import java.util.Scanner;

public class GreaterLessOrEqual {
    public static void main(String[] args) {
        System.out.println("Please print any two numbers: ");
        Scanner sc = new Scanner(System.in);
       int num1 = sc.nextInt(), num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}