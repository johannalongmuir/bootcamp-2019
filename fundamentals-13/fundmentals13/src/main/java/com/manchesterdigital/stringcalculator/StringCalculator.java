package com.manchesterdigital.stringcalculator;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCalculator {
     /*
    Write a program such that when given a string parameter,
    which will perform a mathematical operation and return the result, in words.
    Numbers 0-9 and the symbols "plus" and "minus" are the only inputs allowed in the single parameter
    the program recieves.

    For example:
    stringExpression( "onezeropluseight" ) -> "oneeight"
    stringExpression( "oneminusoneone" ) -> "negativeonezero"

    given string -> convert to number ignoring capitals -> complete opperation -> convert to word -> output
     */

    public static Map<String, Integer> numberMap;

    static {
        numberMap = Map.of(
                "One", 1,
                "Two", 2,
                "Three", 3,
                "Four", 4,
                "Five", 5,
                "Six", 6,
                "Seven", 7,
                "Eight", 8,
                "Nine", 9,
                "Ten", 10);
    }

    public static Integer convert(Map<String, Integer> numberMap, String numberInWord) {
         numberMap.entrySet().stream()
                .filter(stringIntegerEntry -> stringIntegerEntry.getKey().contains(numberInWord))
                .map(Map.Entry::getValue).to

    }
}

