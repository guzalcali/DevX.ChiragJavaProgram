package com.java_demo.class19;

public class PrintPatternSquare {
    public static void main(String[] args) {
        // Print 5 numbers of rows - for # of rows
//        for (int i = 1; i <= 4; i++) {
//
//            // Print 1 to 5 in the same line - for # of digits inside the row
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("*");
//             //   System.out.println();
//                for (int k = 1; k <= 5; k++) {
//                    System.out.print("&");
//                //    System.out.println();
//                    //    System.out.print("*****");
//                }

                //           }

                // Print "Enter" function
                System.out.println();

                for (int i = 1; i <=5; i++) {

                    for (int j = 1; j <= 5; j++) {
                        if (i % 2 == 0) {
                        System.out.print("&");
                    } System.out.println();
                        for (int k = 1; k <= 5; k++) {
                            System.out.print("*");
            }
        }
    }
}

