package com.java_demo.class11;
//write a program to print below numbers
//6 12 18 24 30 36 42 48 54 60


import java.util.Scanner;

public class BrainstormingWhileExample {
    public static void main(String[] args) {
        System.out.println("Please enter your number");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;

        while (i <= num) {
            System.out.println(i * 6);
            i++;
        }

    }
}


