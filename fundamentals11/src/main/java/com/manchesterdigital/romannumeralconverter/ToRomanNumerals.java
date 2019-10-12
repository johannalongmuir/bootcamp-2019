package com.manchesterdigital.romannumeralconverter;

import java.util.Scanner;

public class ToRomanNumerals {
    protected static String converter(int numberInput) {
        int number = numberInput;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Number " + numberInput + " :");

        while(number > 0)
            if (number >= 1000) {
                stringBuilder.append("M");
                number -= 1000;
            }else if (number >= 900){
                stringBuilder.append("CM");
                number -= 900;
            } else if (number >= 500) {
                stringBuilder.append("D");
                number -= 500;
            }else if (number >= 400){
                stringBuilder.append("CD");
                number -= 400;
            } else if (number >= 100) {
                stringBuilder.append("C");
                number -= 100;
            }else if (number >= 90){
                stringBuilder.append("XC");
                number -= 90;
            }  else if (number >= 50) {
                stringBuilder.append("L");
                number -= 50;
            }else if (number >= 40){
                stringBuilder.append("XL");
                number -= 40;
            }else if (number >= 10) {
                stringBuilder.append("X");
                number -= 10;
            }else if (number >= 9){
                stringBuilder.append("IX");
                number -= 9;
            } else if (number >= 5) {
                stringBuilder.append("V");
                number -= 5;
            }else if (number >= 4){
                stringBuilder.append("IV");
                number -= 4;
            }  else if (number >= 1) {
                stringBuilder.append("I");
                number -= 1;
            }
        return stringBuilder.toString();

    }

}
