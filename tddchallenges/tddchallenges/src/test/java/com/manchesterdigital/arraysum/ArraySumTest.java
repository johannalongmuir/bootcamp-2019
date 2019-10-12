package com.manchesterdigital.arraysum;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ArraySumTest {
    /*
    Array Sum

Given an array of several arrays that each contain integers and your goal is to write a function that will sum up all the numbers in all the arrays.

For example, if the input is [[3, 2], [1], [4, 12]]

then your program should output 22 because 3 + 2 + 1 + 4 + 12 = 22. 
     */


    @Test
    public void whenGivenArrayOfOneAndOneOutputSumOfInput() {
        // Act
        int[] initialArray = {1, 1};

        // Arrange
        int result = ArraySum.multiplyArray(initialArray);

        // Assert

        Assertions.assertThat(result).isEqualTo(2);

    }

    @Test
    public void whenGivenArrayOfOneAndTwoOutputSumOfInput() {
        // Act
        int[] initialArray = {1, 2};

        // Arrange
        int result = ArraySum.multiplyArray(initialArray);

        // Assert

        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void whenGivenALargeArrayOutputSumOfInput() {
        // Act
        int[] initialArray = {1, 2, 10, 6, 9};

        // Arrange
        int result = ArraySum.multiplyArray(initialArray);

        // Assert

        Assertions.assertThat(result).isEqualTo(28);
    }

    @Test
    public void whenGivenArrayContainingMultipleArrayOutputSumOfInput() {
        // Act
        int[] arrayInput1 = {1, 5, 10};
        int[] arrayInput2 = {5, 5};
        int[][] initialArray = {arrayInput1, arrayInput2};

        // Arrange
        int result = ArraySum.multiplyArray(initialArray);

        // Assert

        Assertions.assertThat(result).isEqualTo(26);
    }


    @Test
    public void whenGivenArrayContainingMultipleArrayOutputSumOfInputTestMatchGiven() {
        // Act
        int[] arrayInput1 = {3, 2};
        int[] arrayInput2 = {1};
        int[] arrayInput3 = {4, 12};
        int[][] initialArray = {arrayInput1, arrayInput2, arrayInput3};

        // Arrange
        int result = ArraySum.multiplyArray(initialArray);

        // Assert

        Assertions.assertThat(result).isEqualTo(22);
    }
}