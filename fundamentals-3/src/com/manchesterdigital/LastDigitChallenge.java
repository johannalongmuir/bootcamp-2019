package com.manchesterdigital;

public class LastDigitChallenge {
    /*
    Given two int. If last digit matches return true.

     */

    public static void main(String[] args) {

        System.out.println(lastDigit(9,17)); // false
        System.out.println(lastDigit(7,17)); // true
        System.out.println(lastDigit(246,36)); // true
    }

    // method returning boolean
    public static boolean lastDigit(int var1, int var2) {
        return (var1 % 10) == (var2 % 10);
        }

    }

    /* Can use ternary as well.
     * Under lastDigit method
     * return (var1 % 10) == (var2 % 10) ? true : false;
     *
     * Can simplify to what I have above
     *
     * Alternatively had as if
     * if (var1 % 10 == var2 % 10){
     *             return true;
     *         } else {
     *             return false;
     *         }
     */
