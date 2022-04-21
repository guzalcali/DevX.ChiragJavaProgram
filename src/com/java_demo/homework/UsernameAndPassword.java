package com.java_demo.homework;

import java.util.Scanner;

public class UsernameAndPassword {
    public static void main(String[] args) {
        System.out.println("Please enter your username and password : ");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine(), password = sc.nextLine();
        String expUsername = "DevX", expPassword = "Spring2022";

        if (username == expUsername) {
            if (password == expPassword) {
                System.out.println("Login successful");
            } else {
                System.out.println("invalid password");
            }

            } else {
                if (password == expPassword) {
                    System.out.println("Invalid username");
                } else {
                    System.out.println("Login unsuccessful");
                }
            }
        }
    }
