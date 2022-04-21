package com.java_demo.class08;

import java.util.Scanner;

public class CheckCharVowel {
    public static void main(String[] args) {
        System.out.println("Please input any single phonetic character");

        Scanner sc = new Scanner(System.in);
        char c = 'c';
        if(c == 'a' || c =='e' || c=='i'|| c=='o'|| c=='u' ) {
            System.out.println("Vowel");
        }else{
            System.out.println("Not Vowel");
        }
    }
}
