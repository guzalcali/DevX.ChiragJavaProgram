package com.java_demo.class14;

import java.util.Locale;

public class PracticeStringMethods {
    public static void main(String[] args) {
        String str1 = "Good day everyone!";
        String str2 = "GOOD DAY EVERYONE!";
        String str3 = "Good day everyone! welcome to this study session!";

        System.out.println(str1.equals(str2));
        System.out.println(str2.equalsIgnoreCase(str1));
        System.out.println(str3.contains(str1));
        System.out.println(str3.toLowerCase().contains(str2.toLowerCase()));

        String str3UpperCase = str3.toUpperCase();
        String str2UpperCase = str2.toUpperCase();

        System.out.println(str3UpperCase.contains(str2UpperCase));
        System.out.println(str3.toUpperCase());
        System.out.println(str1.indexOf('v'));
        System.out.println(str2.lastIndexOf('D'));
        System.out.println(str2.charAt(0));
        System.out.println(str1.length());
        System.out.println(str3.length());

        str3 = "               ";
        str2 = "";
        System.out.println(str3.isEmpty());
        System.out.println(str2.isEmpty());

        System.out.println(str3.isBlank());
        System.out.println(str2.isBlank());

        str1 = "Her name is Dina";
        str2 = "Nancy";

        System.out.println(str1.replace("Dina", "Nancy"));

        str1 = "Her name is %s, she is %s.";
        str2 = "Geyla";
        System.out.println(str1.format(str1, "Geyla", "12"));

        str1 = "Euro 300, Euro 500, Euro 700, Euro 900";
        str3 = "Dollar";


        System.out.println(str1.replaceAll("[A-Za-z]", ""));

        str1 = "Her name is Dina.";
        System.out.println(str1.substring(4, 8));
        System.out.println(str1.indexOf('D'));
        System.out.println(str1.substring(12, 16));
        System.out.println(str1.indexOf('n'));
        System.out.println(str1.substring(4, 8));
        System.out.println(str1.lastIndexOf('n'));

        String[] words = str1.split(" ");
        System.out.println("12. Split: " + words[0] + words[1] + words[2] + words[3]);
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);

        System.out.println("Using For Loop: ");
        for (int i = 0; i <=3; i++) {
            System.out.println(words[i]);

            }


//        String str1 = "Hello my Friend!";
//        String str2 = "Hello My friend!";
//        String str3 = "Hello my friend! Welcome home!!!";
//
//        System.out.println(str2.equals(str1));
//        // Equality
//
//        System.out.println(str2.equalsIgnoreCase(str1));
//        // Equality ignoring case
//
//        System.out.println(str3.contains(str1));
//        // One string contains the other one
//
//        System.out.println(str3.toUpperCase());
//        System.out.println(str1.toLowerCase());
//        // Changing case of string - Upper case, lower case
//
//        System.out.println(str3.toUpperCase().contains(str1.toUpperCase()));
//        // One string contains another string ignoring the case
//
//        str3 = "Hello my friend! Welcome home!!!";
//        System.out.println(str3.indexOf('W'));
//        System.out.println(str3.lastIndexOf('h'));
//        // Index of character
//
//        System.out.println(str3.charAt(0));
//        // Character at index
//
//        str1 = "Hello my Friend!";
//        str3 = "Hello my friend! Welcome home!!!";
//        System.out.println(str1.length());
//        System.out.println(str3.length());
//        // Length of String
//
//        str1 = "                    ";
//        str3 = "";
//        System.out.println(str1.isEmpty());
//        System.out.println(str3.isEmpty());
//        System.out.println(str1.isBlank());
//        System.out.println(str3.isBlank());
//        // Empty and Blank
//
//        //Replace and ReplaceAll
//        str1 = "Euro 300, Euro 500, Euro 700, Euro 900";
//        str3 = "Som";
//        System.out.println(str1.replace('E', 'A'));
//
//        // Format
//        str1 = "%s, welcome to %s";
//        System.out.println(str1.format(str1, "Elena", "New Age Church!"));


        }
    }

