package com.java_demo.class13;

import java.util.Locale;

// Take one String and two int variables
// Print addition of two num with concatenation with String
public class StringConcatenationAssignment {
    public static void main(String[] args) {

        String str = "Morning!";
        int a = 5, b = 10;

        System.out.println( a + b + str);
        System.out.println(str + a + b);
        System.out.println( str + (a + b));

        System.out.println(str.toUpperCase());

    }
}
