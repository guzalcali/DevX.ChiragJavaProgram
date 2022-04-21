package com.java_demo.class09;

public class IncrementOperators {
    public static void main(String[] args) {
        int i = 5;

        // for Increment:

        i = i + 1; // We have an assignment nad addition operators, and addition operator has a highest priority

        System.out.println(i);
        //for Decrement, we do:

        i = i - 1; // we decrement
        System.out.println(i);

        i++;
        System.out.println(i);
        i--;
        System.out.println(i);

    }
}
