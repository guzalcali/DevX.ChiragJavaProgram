package com.java_demo.class04;

public class StringExample1 {
    // If we do addition with String it'll be concatenation
    // Strings + String = StringString (concatenation)
    // Strings + Integer = StringInt (concatenation)
    // Int + String = IntString (concatenation)
    // Int + Int = Int (addition)
    public static void main(String[] args) {
        int a  = 10, b = 20, c = 30;
        String str1  = "Hello ";
        String str2 = "Java";

        System.out.println(a); // 10
        System.out.println(a + b); // 30

        System.out.println("a + b"); // a + b (because it's a String)
        System.out.println("a" + b); // a20 (because a is a String and b is a variable of type int)
        System.out.println("a" + b + c); // a2030 (a is a String and b is a variable of type int)

        System.out.println(str1 + str2); // HelloJava
        System.out.println(str1 + a); // Hello10
        System.out.println(str1 + a + b); //Hello1020 (Left to right)
        System.out.println(a + b + str1); // 30Hello (Left to right)
        System.out.println(str1 + a * b); // Hello200 (As per priority we'll do multiplication first and then addition)
 //     System.out.println(str1 + a -b); // Error
        System.out.println(a - b + str1); // -10Hello


    }
}
