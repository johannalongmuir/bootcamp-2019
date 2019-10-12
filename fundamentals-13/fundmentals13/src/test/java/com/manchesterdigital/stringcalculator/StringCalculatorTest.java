package com.manchesterdigital.stringcalculator;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Map;

public class StringCalculatorTest {
    /*
    Write a program such that when given a string parameter, which will perform a mathematical operation and
    return the result, in words.
    Numbers 0-9 and the symbols "plus" and "minus" are the only inputs allowed in the single parameter
    the program recieves.
    For example:
    stringExpression( "onezeropluseight" ) -> "oneeight"
    stringExpression( "oneminusoneone" ) -> "negativeonezero"

    given string
    convert to number ignoring capitals
    complete opperation
    convert to word
    output
     */
    Map<String, Integer> numberMap = Map.of(
            "One", 1,
            "Two", 2,
            "Three", 3,
            "Four", 4,
            "Five", 5,
            "Six", 6,
            "Seven", 7,
            "Eight", 8,
            "Nine", 9,
            "Ten", 10);


    @Test
    public void whenGivenWordOneConvertToNumericalOne() {
        // Act
        String numberInWord = "One";

        // Arrange
        Integer result = StringCalculator.convert(numberMap, numberInWord);

        // Assert
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void whenGivenWordTwoConvertToNumericalTwo() {
        // Act
        String numberInWord = "Two";


        // Arrange
        Integer result = StringCalculator.convert(numberMap, numberInWord);

        // Assert
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void whenGivenWordThreeConvertToNumericalThree() {
        // Act
        String numberInWord = "Three";

        // Arrange
        Integer result = StringCalculator.convert(numberMap, numberInWord);

        // Assert
        Assertions.assertThat(result).isEqualTo(3);
    }


}
