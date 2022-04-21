package com.java_demo.class08;

public class LogicalOperatorsExamples {
    public static void main(String[] args) {
        boolean b1 = true, b2 = false;
        System.out.println(b1 || b2);
        System.out.println(b1 && b2);
        System.out.println(!b1 || !b2);

        boolean b3 = true, b4 = false, b5 = true;
        System.out.println(b5 || b3 && b4);
        System.out.println(b3 && b5 && b4 || b4 || b5 && b3 && b4 ||b3);
    }
}
