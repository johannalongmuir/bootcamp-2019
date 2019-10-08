package com.manchesterdigital;

public class RomanNumeralConverter {

    public static void main(String[] args) {
       /* Convert to roman numerals.
       Take number, check against highest value, then convert, then minus

       Could also make a map of some description as below

       1, I
       5, IIII

       Function<Map, String> function = RomanNumeral::getConversion

        */


        System.out.println(converter(1000));

    }


    public static StringBuilder converter(Integer numberInput) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Number " + numberInput + " :");

        // loop it back in
        for (Integer i = numberInput ; i < 3999 ; i--) {
            if (i > 1000) {
                stringBuilder.append("M");
                i -= 1000;
            } else if (i > 500){
                stringBuilder.append("M");
                i -= 500;
            } return stringBuilder;


        } return stringBuilder;
    }

}