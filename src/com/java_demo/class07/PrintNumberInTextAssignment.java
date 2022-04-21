package com.java_demo.class07;

//Take one number from user (0-9) & print number in text format

// Example input - 1, output - One
// Example input - 7, output - Seven

import java.util.Scanner;

public class PrintNumberInTextAssignment {
    public static void main(String[] args) {
        System.out.println("Please input any number from ( 0 ) to ( 9 ) in numerical value");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println(" zero ");
        } else if (number == 1) {
            System.out.println("one");
        } else if (number == 2) {
            System.out.println("two");
        } else if (number == 3) {
            System.out.println("three");
        } else if (number == 4) {
            System.out.println("four");
        } else if (number == 5) {
            System.out.println("five");
        } else if (number == 6) {
            System.out.println("six");
        } else if (number == 7) {
            System.out.println("seven");
        } else if (number == 8) {
            System.out.println("eight");
        } else if (number == 9) {
            System.out.println("nine");
        } else {
            System.out.println("Invalid input, please enter from 0-9 only");
        }
    }
}










