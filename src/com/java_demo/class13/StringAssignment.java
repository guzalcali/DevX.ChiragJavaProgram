package com.java_demo.class13;
// Create  three String Variables
// Initialize two variable with constant values
// take third variable value from user using Scanner class
// compare 1st and 2nd using == operator
// compare 2nd and 3rd using == operator
// compare 1st and 3rd using .equals() method

import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Monday = "day";
        String Wednesday = "day";
        String Friday = sc.nextLine();
        // String Friday = new String("day");

        if (Monday == Wednesday) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (Wednesday == Friday) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (Monday.equals(Friday)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}









