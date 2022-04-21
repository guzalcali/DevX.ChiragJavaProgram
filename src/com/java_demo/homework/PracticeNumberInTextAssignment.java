package com.java_demo.homework;

import java.util.Scanner;

public class PracticeNumberInTextAssignment {
    public static void main(String[] args) {
        System.out.println("Please enter any number from 0 to 9 only: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("Your number is zero");
        } else if (num == 1) {
            System.out.println("Your number is one");
        } else if (num == 2) {
            System.out.println("Your number is two");
        } else if (num == 3) {
            System.out.println("Your number is three");
        } else if (num == 4) {
            System.out.println("Your number is four");
        } else if (num == 5) {
            System.out.println("Your number is five");
        } else if (num == 6) {
            System.out.println("Your number is six");
        } else if (num == 7) {
            System.out.println("Your number is seven");
        } else if (num == 8) {
            System.out.println("Your number is eight");
        } else if (num == 9) {
            System.out.println("Your number is nine");
        }else{
            System.out.println("Please enter valid numbers only");
        }
    }
}



