package com.manchesterdigital;

public class ForLoopExample {

    public static void main(String[] args) {

        /** what signature looks like
         * for (initialisation; boolean expression; update statement; update statement) {
         * // one or more lines of logic
         * }
         */


        // loop from 0 to 100
        for (int i = 0; i <= 100; i ++) {
            System.out.println("i => " + i);

        }

        // need to be very careful
        int x = 0;
        for (x = 0; x <= 100; x ++) {
            System.out.println("x => " + x);

        }

        System.out.println("x outside = " + x);

        // what does this do.
        // IF ACCIDENTLY RUN, CNT C to cancel program. Indefinite loop
        /*for (;;) {
        System.out.println("Wohooo");

        Would print Wohoo forever
         */
    }
}
