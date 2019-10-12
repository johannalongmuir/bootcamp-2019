package com.manchesterdigital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RegMeNow {

    // static Map
    private static Map<String, Integer> replacementCharacters;

    static {
        replacementCharacters = new HashMap<>();
        replacementCharacters.put("S", 5);
        replacementCharacters.put("A", 4);
        replacementCharacters.put("G", 9);
        replacementCharacters.put("B", 8);
        replacementCharacters.put("I", 1);
    }

    public static String characterConverter(String numberPlate) {
        if (numberPlate.length() > 7) {
            throw new RegMeNowException("Your plate is too big");
        }
        if (numberPlate.length() < 5) {
            throw new RegMeNowException("Your plate is too small");
        }

        StringBuilder result = new StringBuilder();
        String[] numbersArray = numberPlate.split("");

        for (String number : numbersArray) {
            if (replacementCharacters.containsKey(number)) {
                result.append(replacementCharacters.get(number));
            } else {
                result.append(number);
            }
        } return result.toString();
    }
}





        //for (String string : split) {

            // if split string is contained in replacement Character key, replace with value

        // char[] plateCharacters = numberPlate.toCharArray();

        /*for (int i = 0; i < plateCharacters.length; i++) {
            if (plateCharacters[i] == 'S') {
                result.append("5");
            } else if (plateCharacters[i] == 'A') {
                result.append("4");
            } else if (plateCharacters[i] == 'G') {
                result.append("9");
            } else if (plateCharacters[i] == 'B') {
                result.append("8");
            } else if (plateCharacters[i] == 'I'){
                result.append("1");
            } else {
                result.append(plateCharacters[i]);
            }
        }

         */


