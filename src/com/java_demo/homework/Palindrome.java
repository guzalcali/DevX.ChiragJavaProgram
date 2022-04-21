package com.java_demo.homework;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Please type in any word: ");
        Scanner sc = new Scanner(System.in);
        //need to take an input from the user
        String word = sc.nextLine().toLowerCase();
        //we need to compare word to word backwards "word" == "drow"
        // we need to invert our original word
        String inverted = ""; // inverted string
        //dog
        for (int i = word.length() - 1; i >= 0; i--) {
            inverted = inverted + word.substring(i, i + 1);
        }

//        String word1 = "palindrome";
//        System.out.println(word1.length());
//        String sub = word1.substring(9,0);
//        String sub1 = word1.substring(8,9);
//        String sub2 = word1.substring(7,8);

        //    inverted = sub + sub1 + sub2;
        //palindrome: if String reads the same forwards and backwards it is a palindrome

        //System.out.println("Inverted word: " + inverted);

        if (word.equals(inverted)) {
            System.out.println(word + " is a palindrome. ");
        } else {
            System.out.println(word + " is not a palindrome. ");
            //  }

            //  char result = myStr.charAt(4);
            //  char result1 = myStr.charAt(3);
            // String myStr1 = (String) result;
            //  myStr1=myStr1+result1;
            //  System.out.println(myStr1);
        }
    }
}

