package com.java_demo.class05;

import java.util.Scanner;

public class MultiplicationPractice {
    public static void main(String[] args) {
        System.out.println("Please enter any two numbers");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(), num2 = sc.nextInt();
        System.out.println(num1 * num2);

    }
}
