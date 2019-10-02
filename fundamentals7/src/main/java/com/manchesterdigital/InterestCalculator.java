package com.manchesterdigital;

import com.sun.org.apache.xpath.internal.operations.String;

public class InterestCalculator {

    public static void main(String[] args) {
        double amount = 100.0d;


        // given a string STR and non negatve int N, return a large string that is N copies
        // of the original String.
        // stringTimes ("Hi", 2) => "HiHi
        // stringTimes ("Hi, 4) => "HiHiHiHi"


        // how do I work out the inetest for 10, 20, 30, 40, 50 years
        /* for (int i = 10; i <= 50; i+=10) {
            System.out.println(calculateInterest(amount, i));
        }
         */

       /* for (int i = 0; i <= 10; i++) {
            System.out.println(calculateInterest(amount, i));
        }
        */


        // Create a for statement from 1 to 500 inclusive and sum up the numbers that
        // are divisible  by 3 and divisible  by 5.
        // Print these numbers as well and the total
        // initised numbr outside of for as needed to print a total in this instance.

        /*int number = 0;
        for (int i = 0; i <= 500; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                number += i;
                System.out.println(i);
            }
        }
        System.out.println("Total " + number);

         */
    }

    // method for the above for examples about calculating interest
    /*private static double calculateInterest(double amount, int i) {
        return (amount * i / 100);
    }

     */
}
