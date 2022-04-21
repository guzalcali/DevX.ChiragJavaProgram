package com.java_demo.homework;

//	1. If username correct and password correct ---> Login successful
//	2. If username correct and password incorrect --> Invalid password
//	3. If username incorrect and password correct --> Invalid username
//	2. If username incorrect and password incorrect --> Login unsuccessful

import java.util.Scanner;

public class HomeWorkClass07UsernameAndPassword {
    public static void main(String[] args) {
        System.out.println("Please enter username & password: ");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine(), password = sc.nextLine();
        String expUsername = "DevX", expPassword = "Spring2022";

        //Output
        if (username == "DevX" && password == "Spring2022") {
            System.out.println("Login successful");
        } else if (username != "DevX" && password != "Spring2022") {
            System.out.println("Login unsuccessful");
        } else if (username != "DevX" && password == "Spring2022") {
            System.out.println("Invalid username");
        } else {
            System.out.println("Invalid password");
        }

//        // Approach 2
//        if (username == expUsername) {
//            if (password == expPassword) {
//                System.out.println("Login successful");
//            } else {
//                System.out.println("Invalid password");
//            }
//        } else {
//            if (password == expPassword) {
//                System.out.println("Invalid username");
//            } else {
//                System.out.println("Login unsuccessful");
//            }
//
//            // Approach 3
//
//            if (username == expUsername) {
//                if (password == expPassword) {
//                    System.out.println("Login successful");
//                } else {
//                    System.out.println("Invalid password");
//                }
//            } else {
//                if (password == expPassword) {
//                    System.out.println("Invalid username");
//                } else {
//                    System.out.println("Login unsuccessful");
//                }
//
//
//            }
//        }
    }
}