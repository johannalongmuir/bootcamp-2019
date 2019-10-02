package com.manchesterdigital;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TenGreenBottlesChalleng {

    public static void main(String[] args) {

        /* write program that adds words into TEN GREEN BOTTLES
        Using any looping mechanism: Write a program that displays the out put for
        "Ten Green Bottles"

        Starting at 10
        number -- on each loop
        int i = 10; i >= 0; i --
        Sout = can type in here but not very clean

        method for 10 green bottles verse to add the Numbers as Strings instead of numbers
        Array for numbers as words. Can call e.g 1 and bring up ONE
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN
        Refactor this at the end to be constants
        Assad did as while loop
         */


        // can do just as a normal array. Good to do starting at TEN as
        ArrayList<String> numbersAsStrings = new ArrayList<>();
        numbersAsStrings.add("ZERO");
        numbersAsStrings.add("ONE");
        numbersAsStrings.add("TWO");
        numbersAsStrings.add("THREE");
        numbersAsStrings.add("FOUR");
        numbersAsStrings.add("FIVE");
        numbersAsStrings.add("SIX");
        numbersAsStrings.add("SEVEN");
        numbersAsStrings.add("EIGHT");
        numbersAsStrings.add("NINE");
        numbersAsStrings.add("TEN");

        int i;

        for (i = 10; i >= 1; i--) {
            String numberAtPosition1 = numbersAsStrings.get(i);
            String numberAtPosition2 = numbersAsStrings.get(i-1);
            System.out.println ("There are " + numberAtPosition1 +
                    " green bottles sitting on a wall " +
                    "If one of those bottles, should accidentley fall then there will be "
                    + numberAtPosition2 + " Green bottles sitting on the wall");
        }

    }

}
