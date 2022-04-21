package com.java_demo.class15;

// Write a program to print each component of String into a separate line
public class FindEachComponentOfAddress {
    public static void main(String[] args) {
//        String address = "B604, Cosmos Society, Magarpatta City, Pune, 411013";
//        String[] words = address.split(" ");
//
//        for (int i = 0; i < words.length; i++) {
//            System.out.println(words[i]);


            String address1 = "250 Convention Drive, Apartment 7214, Fairview, Texas, 75069";
            String[] words1 = address1.split(" ");

            for (int i1 = 0; i1 <= 7; i1++) {
                System.out.println(words1[i1]);

            }
        }
    }

