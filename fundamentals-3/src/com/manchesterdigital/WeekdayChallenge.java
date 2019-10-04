package com.manchesterdigital;

public class WeekdayChallenge {

    /*
    Given that a day is represented by a number and Monday is represented as number 1
    1. Print out when day is weekday
    2. On a Tuesday I go to the Gym. Display this
    3. On a Thursday I go to the Gym. Display this
    4. On a Sunday I do gardening. Display this
     */

    public static void main(String[] args) {
        int day = 2;

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
