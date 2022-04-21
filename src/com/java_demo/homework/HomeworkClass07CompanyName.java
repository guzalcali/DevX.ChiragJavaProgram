package com.java_demo.homework;

import java.util.Scanner;

public class HomeworkClass07CompanyName {
    public static void main(String[] args) {
        System.out.println("Please enter a program or application name");

        Scanner sc = new Scanner(System.in);
        String programName = sc.nextLine();
        switch (programName) {
            case "Gmail":
            case "Hangouts":
                System.out.println("Google");
                break;
            case "Whatsapp":
            case "YouTube":
                System.out.println("Facebook");
                break;
            case "Skype":
            case "Outlook":
                System.out.println("Microsoft");
                break;
            default:
                System.out.println("Please enter a program or application name");
        }
    }
}
