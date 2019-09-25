package com.mancheterdigital;

public class Utility {

    // create a method that determines if number odd or even
    // static is even that has only one method allocated in memory
    public static boolean isEven (int a){
        /* modulus. can do below but better to do one below
        if (a % 2 == 0) {
            return true;
        }
        return false; */

        return (a % 2 == 0);
    }
//naming conventions. Make it obvious. Function below
    public static boolean isNamesMatch(String firstName, String lastName) {
        return firstName.equalsIgnoreCase(lastName);
    }

    /**
     * Java Docs. Best practice. Update changes + list off what the throws are etc. Can see in CNTL J over method name
     * Converts a string to a long
     *
     * @param input the input recieved.
     * @return a long if successful
     * @throws NumberFormatException if input is not a number and outside a long's limit
     */



    // Long is wrapper class. Constructor as new + taking an input.
    // This could have a wobbler as wants numbers "1246" not "124bhc" so add throw ctl space
    // Look at Java.docs to see which option might be best for Long out of the options given
    public static Long convertStringToLong(String input) throws NumberFormatException {
        return new Long(input);
    }



}
