package com.java_demo.homework;

import java.util.Scanner;

public class HWClass05LeapYearOrNot {
    public static void main(String[] args) {
        System.out.println("Please enter any year and I will tell you whether it is a leap year or not");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println(year + " is a leap year ");
        } else {
            System.out.println(year + " is an ordinary year ");
        }

    }
}
