package com.manchesterdigital;

public class RestaurantChallenge {
    public static void main(String[] args) {
        waiterResponse(4, 9);
    }

    private static void waiterResponse(int style, int bribe) {

        if (style < 8 || bribe < 5) {
            System.out.println("Not allowed in");
        }
    }

    /**
     Can do public static boolean isNotSatisfied(int style, int bribe)
     return style >= 8 && bride >= 5;
     */

}


