package com.manchesterdigital;

public class IfStatements {

    public static void main(String[] args) {

        /** if (condition) {
         //block/body of the IF
         }
         avoid having too many else if statements
         avoid having too many nested if statements

         **/

        int age = 50;

        if (age >= 29) {
            System.out.println("Age is over 29");
        } else if (age <= 30) {
            System.out.println("Age is under 30");
        } else { //<<<<<< this is new
            System.out.println("No it isn't");
        }
    }
}
