package com.java_demo.class11;

import java.util.Scanner;

public class WhileLoopAnalysis {

    public static void main(String[] args) {
        // int i =1;
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        int i = 1;

        while (i <= limit/2) {

            // while(i<=5){
            System.out.println(11 - i);
            System.out.println(i);
            i++;

        }
    }
}

