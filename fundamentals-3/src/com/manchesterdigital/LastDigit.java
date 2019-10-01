package com.manchesterdigital;

public class LastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(9,17));
    }
    // method returning boolean
    public static boolean lastDigit(int var1, int var2) {
        return (var1 % 10) == (var2 % 10);
        }

    }

    /**
     * Can use ternary as well. under lastDigit method return (var1 % 10) == (var2 % 10) ? true : false;
     * Can do it as simple as return (var1 % 10) == (var2 % 10);
     *
     * if (var1 % 10 == var2 % 10){
     *             return true;
     *         } else {
     *             return false;
     *         }
     *
     */
