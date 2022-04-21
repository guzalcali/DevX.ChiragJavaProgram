package com.java_demo.class11;

import java.util.Scanner;

public class InClassExample {
    public static void main(String[] args) {
        System.out.println("Please print how many numbers you want");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i = 1;

        while (i <= num) {

            if(i % 3 == 0 ) {
                System.out.println('*');
            }else{
                System.out.println(i);
            }
            i++;
        }
    }
}

