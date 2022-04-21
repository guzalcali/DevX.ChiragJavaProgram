package com.java_demo.class05;
// Take two numbers from user and print greater number out of two numbers

import java.util.Scanner;

public class ScannerClassExample2 {

    public static void main(String[] args) {

        System.out.println("Input any two numbers:");

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(), num2 = sc.nextInt();
        System.out.println(num1 * num2);
    }
}


