package com.manchesterdigital;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class FizzBuzzChallenge {

    private static final String DIVISABLE_THREE_AND_FIVE = "fizzbuzz";
    private static final String DIVISABLE_THREE = "Fizz";
    private static final String DIVISABLE_FIVE = "Buzz";


    protected static String convert(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return DIVISABLE_THREE_AND_FIVE;
        } else if (number % 3 == 0) {
            return DIVISABLE_THREE;
        } else if (number % 5 == 0) {
            return DIVISABLE_FIVE;
        }
        return String.valueOf(number);
    }

}

