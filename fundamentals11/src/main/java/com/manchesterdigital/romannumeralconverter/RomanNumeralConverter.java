package com.manchesterdigital.romannumeralconverter;

import java.util.Scanner;

public class RomanNumeralConverter {

    public static void main(String[] args) {
       /* Convert to roman numerals.
       Take number, check against highest value, then convert, then minus

       Could also make a map of some description as below
       1, I
       5, IIII
       Function<Map, String> function = RomanNumeral::getConversion
        */

        Scanner userInput = new Scanner(System.in);
        int userNumber = userInput.nextInt();
        System.out.println(ToRomanNumerals.converter(userNumber));


    }
}
