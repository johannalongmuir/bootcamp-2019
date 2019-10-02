package com.manchesterdigital;

import java.util.Arrays;

public class WhileLoopExample {

    public static void main(String[] args) {

        /**
         * while some form of expression is true. Evaluates the same as an if statement
         *
         * while (boolean expression) {
         *
         *      //body
         *   }
         */

        // only use while when have an underterministic number of things you are checking

        double growthRate = 0.04d; // 4%
        int population = 800; // initial population of puffins
        int year = 0; // i.e present time

        while (population <= 1200) {
            Double tempPopulation = new Double(population * (1 + growthRate)); // mathematical value
            population = tempPopulation.intValue(); // prevents from casting so doing this way
            year++;
        }

        System.out.println("year = " + year);
        System.out.println("population = " + population);


    }




}
