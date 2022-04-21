package com.java_demo.homework;

import java.util.Scanner;

public class HWCLass06Calendar {
    public static void main(String[] args) {
        System.out.println("Please input any number from 1 to 12 corresponding the month order, and I will give you number of days in the given month");
        Scanner sc = new Scanner(System.in);

        int monthNum = sc.nextInt();

        if (monthNum == 1) {
            System.out.println(monthNum + " corresponds to January and has 31 days");
        } else if (monthNum == 2) {
            System.out.println(monthNum + " corresponds to February and has 28 or 29 days");
        } else if (monthNum == 3) {
            System.out.println(monthNum + " corresponds to March and has 31 days");
        } else if (monthNum == 4) {
            System.out.println(monthNum + " corresponds to April and has 30 days");
        } else if (monthNum == 5) {
            System.out.println(monthNum + " corresponds to May and has 31 days");
        } else if (monthNum == 6) {
            System.out.println(monthNum + " corresponds to June and has 30 days");
        } else if (monthNum == 7) {
            System.out.println(monthNum + " corresponds to July and has 31 days");
        } else if (monthNum == 8) {
            System.out.println(monthNum + " corresponds to August and has 31 days");
        } else if (monthNum == 9) {
            System.out.println(monthNum + " corresponds to September and has 30 days");
        } else if (monthNum == 10) {
            System.out.println(monthNum + " corresponds to October and has 31 days");
        } else if (monthNum == 11) {
            System.out.println(monthNum + " corresponds to November and has 30 days");
        } else if (monthNum == 12) {
            System.out.println(monthNum + " corresponds to December and has 31 days");
        } else {
            System.out.println("Number is not valid, please see instructions above");
        }

    }
}
