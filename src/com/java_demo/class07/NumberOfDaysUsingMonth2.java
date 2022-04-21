package com.java_demo.class07;

// Take month name from user and print number of days in given month

import java.util.Scanner;

public class NumberOfDaysUsingMonth2 {
    public static void main(String[] args) {
        System.out.println("Please enter a month");
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();

        switch (month) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31 days");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30 days");
                break;
            case "February":
                System.out.println("28 or 29 days");
                break;
            default:
                System.out.println("Please enter a month");
        }
    }
}
