package com.java_demo.class05;
// Write a program to check given number is odd or even
public class IfElseExample2 {

    public static void main(String[] args) {

        System.out.println(15 % 2); // 1
        System.out.println(52 % 2); // 0
        System.out.println(21 % 2); // 1
        System.out.println(4 % 2); // 0

        int num = 6;

        if(num == 2){
            System.out.println("1. Even");
        }else{
            System.out.println("2. Odd");
        }
        System.out.println("3. End");


        int num1 = 6;

        if(num1 % 2 == 0) {
            System.out.println("num1 is even");
        }else{
            System.out.println("num1 is odd");
        }
        }

    }
