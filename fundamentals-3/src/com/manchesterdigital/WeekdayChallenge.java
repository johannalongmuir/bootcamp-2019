package com.manchesterdigital;

public class WeekdayChallenge {
    public static void main(String[] args) {
        int day = 6;

        if (day <= 5) {
            System.out.println("Weekday!");
        }

        if (day == 7) {
            System.out.println("Gardening");
        } else if (day == 2 || day == 4) {
            System.out.println("Go to the Gym!");
        } else {
            System.out.println("Have a nice day off!");
        }





    }
}
