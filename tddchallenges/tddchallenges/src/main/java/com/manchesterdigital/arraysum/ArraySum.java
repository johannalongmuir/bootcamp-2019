package com.manchesterdigital.arraysum;


import java.util.Arrays;


public class ArraySum {
    public static int multiplyArray(int[] initialArray) {
        return Arrays.stream(initialArray)
                .sum();

    }

    public static int multiplyArray(int[][] initialArray) {
        int sum = 0;
        for (var i = 0; i < initialArray.length; i++) {

            // loop through each inner array
            for (var j = 0; j < initialArray[i].length; j++) {

                // add this number to the current final sum
                sum += initialArray[i][j];
            }
        }
        return sum;
    }
}