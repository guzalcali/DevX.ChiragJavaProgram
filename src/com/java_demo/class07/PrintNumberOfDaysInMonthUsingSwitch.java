package com.java_demo.class07;

import java.util.Scanner;

public class PrintNumberOfDaysInMonthUsingSwitch {
    public static void main(String[] args) {
        System.out.println("Please enter a month : ");
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();

        switch (month) {
            case "January":
                System.out.println("31 days");
                break;
            case "February":
                System.out.println("28 or 29 days");
                break;
            case "March":
                System.out.println("31 days");
                break;
            case "April":
                System.out.println("30 days");
                break;
            case "May":
                System.out.println("31 days");
                break;
            case "June":
                System.out.println("30 days");
                break;
            case "July":
                System.out.println("31 days");
                break;
            case "August":
                System.out.println("31 days");
                break;
            case "September":
                System.out.println("30 days");
                break;
            case "October":
                System.out.println("31 days");
                break;
            case "November":
                System.out.println("30 days");
                break;
            case "December":
                System.out.println("31 days");
                break;

            default:
                System.out.println("Please enter a month");


        }

    }
}

