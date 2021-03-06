package com.manchesterdigital;

public class Variables {
    /* Member class variables are available anywhere in the class.
       Created once in this case as static in memory.
       Remember to be careful with static.
     */

    static boolean isHungry = false;


    // Main method
    public static void main(String[] args) {
        greetWhenAdult(12);

    }

    /** What do we want to do
     * Greets base on age
     * @param age this is the age required
     */

    private static void greetWhenAdult (int age) {
        // example of local variable, only available in this method, cannot access from elsewhere
        boolean isHappy = true;
        //example of expression, evaluates at the exact point in time
        if (!isHungry) {
            if (isHappy && age >= 18) {
                System.out.println("Hello");
            }
        }
    }
} //end of class this is helpful to put to make sure you don't lose a curly brace
