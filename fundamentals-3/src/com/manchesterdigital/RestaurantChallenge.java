package com.manchesterdigital;

public class RestaurantChallenge {

    /*
    Waiter assessing guests based on Style + Bribe to see if letting them in the restaurant
    If style is less than 8, and bribe less than 5 won't let them in
     */
    public static void main(String[] args) {
        waiterResponse(4, 9);

    }

    private static void waiterResponse(int style, int bribe) {

        if (style < 8 || bribe < 5) {
            System.out.println("Not allowed in");
        }
    }

    /*
     Can do
     public static boolean isNotSatisfied(int style, int bribe)
     return style >= 8 && bride >= 5;
     */

}


