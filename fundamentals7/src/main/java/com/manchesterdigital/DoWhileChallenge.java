package com.manchesterdigital;

public class DoWhileChallenge {

    public static void main(String[] args) {
    /*
    Write a program that uses a do-while loop from 1-10 and quits when its 7
    Print all values
     */

        int value = 0;
        boolean valueLessThan7 = false;

        do {
            if (value <= 7) {
                valueLessThan7 = true;
                System.out.println(value);
                value++;
            }
        } while (valueLessThan7) ;
    }
}

