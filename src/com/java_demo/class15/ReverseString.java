package com.java_demo.class15;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Please enter any String: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int String = word.lastIndexOf(word.length());
        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word.charAt(i));

        }
    }
}
