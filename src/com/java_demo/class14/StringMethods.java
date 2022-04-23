package com.java_demo.class14;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Sofiya is a Champion!";
        String str2 = "Sofiya is a champion!";
        String str3 = "Sofiya is a Champion! Greet Sofiya!!!";

        //1. Check equality of two Strings
        System.out.println("1. Equality: " + str1.equals(str2));
        System.out.println("=======================================================");

        //2. Check equality of two Strings ignoring case
        System.out.println("2. Equality ignoring case: " + str1.equalsIgnoreCase(str2));
        System.out.println("=======================================================");

        // 3. Check whether one String contains another String
        // Contains will only check whether one string contains another string considering letter case sensitivity

        System.out.println("3. Contains: " + str3.contains(str1));

        // OR we can directly switch the case and compare contents as below :
        System.out.println("3.1 Contains: " + str3.toUpperCase().contains(str1.toUpperCase()));


        // If we want to check whether one String contains another String ignoring case then we have to change
        // both Strings in same letter case and then check "contains" , so it'll check only content of both Strings
        String str3UpperCase = str3.toUpperCase();
        String str2UpperCase = str2.toUpperCase();

        System.out.println("3.2 Contains: " + str3UpperCase.contains(str2UpperCase));
        System.out.println("=======================================================");

        // 4. Changing the case of String
        System.out.println("4. Upper Case: " + str3.toUpperCase());
        System.out.println("4. Upper Case: " + str3.toLowerCase());
        System.out.println("=======================================================");

        // 5. Find index of character
        str1 = "Sofiya is a Champion!";
        System.out.println("5. Index of Char: " + str1.indexOf('i'));
        System.out.println("5.1 Last Index of Char: " + str1.lastIndexOf('i')); // for the right side of sentence
        System.out.println("=======================================================");

        // 6. Find character at index
        str1 = "Sofiya is a Champion!";
        System.out.println("6. Char at Index: " + str1.charAt(0));
        System.out.println("=======================================================");

        // 7. Length of String
        str1 = "Sofiya is a Champion!";
        str3 = "Sofiya is a Champion! Greet Sofiya!!!";
        System.out.println("7. Length Of String: " + str1.length());
        System.out.println("7. Length Of String: " + str3.length());
        System.out.println("=======================================================");

        // 8. Empty and Blank
        str1 = "                  ";
        str3 = "";
        System.out.println("8. Length Of String:" + str1.length());
        System.out.println("8.1 Empty: " + str1.isEmpty());
        System.out.println("8.2 Empty: " + str3.isEmpty());
        System.out.println("8.3 Blank: " + str1.isBlank());
        System.out.println("8.4 Blank: " + str3.isBlank());
        System.out.println("=======================================================");

        // 9. Replace & ReplaceAll
        str1 = "Year 20  Year 30 Year 40 Year 50";
        str3 = "Day";
        System.out.println("9. Replace: " + str1.replace("Year", "day"));
        System.out.println("9.1 Replace: " + str1.replaceAll("[A-Za-z ]", ""));
        System.out.println("9.2 Replace: " + str1.replaceAll("[0-9 ]", ""));
        System.out.println("9.3 Replace: " + str1.replaceAll("[^A-Z, ^a-z ]", ""));
        System.out.println("9.4 Replace: " + str1.replaceAll("[^0-9 ]", "")); //replace everything, besides ^...
        System.out.println("=======================================================");

        // 10. Format
        str1 = "%s, welcome to %s";
        str2 = "Welcome %s, Welcome to %s";
        System.out.println("10. Format: " + String.format(str1, "Sofiya", "Ebay"));
        System.out.println(String.format(str2, "Sofiya", "Ebay"));
        System.out.println("=======================================================");

        // 11. SubString
        str1 = "Mother duck teaches her baby ducklings to swim.";
        System.out.println("11. SubString: " + str1.substring(6));
        System.out.println("11.1 SubString: " + str1.substring(0, 6));
        System.out.println("=======================================================");

        // 12. Split
        str1 = "Mother duck teaches her baby ducklings to swim";
        String[] words = str1.split(" ");
        System.out.println("12. Split: " + words[0] + words[1] + words[2] + words[3] + words[4] + words[5] + words[6] + words[7]);
//        System.out.println(words[0]);
//        System.out.println(words[1]);
//        System.out.println(words[2]);
//        System.out.println(words[3]);
//        System.out.println(words[4]);
//        System.out.println(words[5]);
//        System.out.println(words[6]);
//        System.out.println(words[7]);
//        System.out.println("12. Split: " + words[0]);
//
//        for (int i = 0; i <= 7; i++) {
//            System.out.println(words[i]);

            str2 = "Sofiya enjoys swimming. She has a swimming class today, in fact.";
            String[] words2 = str2.split(" ");

            //  Find length of String
            System.out.println("12.1 Length of String: " + str2.length());
            System.out.println("12.2 Length/number of words: " + words2.length);

//            12.3 Split:
            for (int i1 = 0; i1 < words2.length; i1++) {
                System.out.println(words2[i1]);
            }
        }
    }



