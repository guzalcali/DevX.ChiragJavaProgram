package com.java_demo.class15;

import java.util.Scanner;

// Take Full Name from user and print initials of it
public class PrintInitials {
    public static void main(String[] args) {
        System.out.println("Please enter your full name: ");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine(); // G.A.M.
        String parts[] = fullName.split(" ");
        String firstName = parts[0];
        String middleName = parts[1];
        String lastName = parts[2];

        System.out.println(firstName.charAt(0)+"."  +middleName.charAt(0)+ "." +lastName.charAt(0) + ".");

    }
}


