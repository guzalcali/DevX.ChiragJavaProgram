package com.java_demo.homework;

import java.util.Scanner;

public class HWClass05DivisibleByFiveNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter any positive whole number");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5 ");
        } else if (num % 5 >= 0) //cannot use || or here for <= 0 for negative numbers
        {
            System.out.println(num + " is not divisible by 5 ");
        } else {
            System.out.println("Please enter only allowed numbers per instructions above: ");
        }
    }
}
