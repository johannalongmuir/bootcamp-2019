package com.manchesterdigital;

public class StringBuidlerExampleLoops {

    public static void main(String[] args) {
        // given a string STR and non negatve int N, return a large string that is N copies
        // of the original String.
        // stringTimes ("Hi", 2) => "HiHi
        // stringTimes ("Hi, 4) => "HiHiHiHi"

        System.out.println(stringOutput("Hi", 5));
        System.out.println(stringOutput("Hi", 2));

    }

    // method for string builder challenge
    private static String stringOutput(String strInput, int times) {
        StringBuilder out = new StringBuilder();
        for (int i = 1; i <= times; i++) {
            out.append(strInput);
        }
        return out.toString();

    }



 }