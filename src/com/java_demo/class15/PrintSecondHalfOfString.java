package com.java_demo.class15;

import java.util.Scanner;

// Write a program to print 2nd half of statement

public class PrintSecondHalfOfString {
    public static void main(String[] args) {
        System.out.println("Enter any word: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        if (str.length() % 2 == 0){
            System.out.println(str.substring(str.length() / 2));
        } else {
            System.out.println(str.substring(str.length() / 2 + 1));
        }
    }
}

