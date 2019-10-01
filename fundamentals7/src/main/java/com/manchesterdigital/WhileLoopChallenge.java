package com.manchesterdigital;

public class WhileLoopChallenge {

    public static void main(String[] args) {
        /*
        Write a program that loops from 1 to 100 and works out the average of the
        numbers as well as the total of the numbers when added together.
        For example if I loop from 1 to 3, the sum would 6 and the average would be 2.
         */

        int initialNumber = 1;
        int total = 1;


        while (initialNumber <= 100) {
            Integer tempInitialNumber = new Integer(initialNumber);
            total += tempInitialNumber;
            System.out.println(initialNumber);
            initialNumber++;
        }

        int numberAverage = (total / initialNumber);
        System.out.println("total = " + total);
        System.out.println("average = " + numberAverage);


    }


}
