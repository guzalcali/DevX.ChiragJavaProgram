package com.java_demo.class13;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strawberry = "berry";
        String raspberry = "berry";
        String banana = "fruit";
        String blueberry = new String("berry");

        if (blueberry.equals(strawberry)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
