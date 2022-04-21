package com.java_demo.class08;

import java.util.Scanner;

public class MaximumOutOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter any three numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();

        if (num1 > num2 && num1 >num3) {
                System.out.println(num1 + " has the greatest value");
            } else if (num2 > num3) {
                System.out.println(num2 + " has the greatest value");
                } else {
                    System.out.println(num3 + " has the greatest value");
                }
            }
        }

