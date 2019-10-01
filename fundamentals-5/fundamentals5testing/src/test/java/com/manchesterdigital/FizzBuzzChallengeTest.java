package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzChallengeTest {

    @Test
    public void returnFizzIfNumberis3() {
        int number = 3;
        String multipleOfThree = "Fizz";
        String multiple = FizzBuzzChallenge.convert(multipleOfThree, number);
        Assertions.assertThat(multiple).isEqualTo("Fizz");
    }

    @Test
    public void returnFizzIfNumberIs6() {
        int number = 6;
        String multipleOfThree = "Fizz";
        String multiple = FizzBuzzChallenge.convert(multipleOfThree, number);
        Assertions.assertThat(multiple).isEqualTo("Fizz");
    }

    @Test
    public void returnFizzIfNumberIsMultipleOf3() {
        int number = 9;

        String multipleOfThree = "Fizz";

        String multiple = FizzBuzzChallenge.convert(multipleOfThree, number);
        Assertions.assertThat(multiple).isEqualTo("Fizz");
    }

    @Test
    public void returnfizzBuzzIfNumberIsMultipleof3And5() {
        int number = 15;
        String multipleOfThree = "fizzbuzz";

        String multiple = FizzBuzzChallenge.convert(multipleOfThree, number);

        Assertions.assertThat(multiple).isEqualTo("fizzbuzz");
    }

    @Test
    public void returnBuzzIfNumber5() {
        int number = 5;
        String multipleOfThree = "Buzz";

        String multiple = FizzBuzzChallenge.convert(multipleOfThree, number);

        Assertions.assertThat(multiple).isEqualTo("Buzz");
    }

    @Test
    public void returnBuzzIfMultipleOf5() {
        int number = 10;
        String multipleOfThree = "Buzz";

        String multiple = FizzBuzzChallenge.convert(multipleOfThree, number);

        Assertions.assertThat(multiple).isEqualTo("Buzz");
    }

    @Test
    public void returnNumberIfNumberIsNotMultipleOf3r5() {
        int number = 7;
        String multipleOfThree = "number";

        String multiple = FizzBuzzChallenge.convert(multipleOfThree, number);

        Assertions.assertThat(multiple).isEqualTo(String.valueOf(number));
    }

    @Test
    public void returnNumberIfNumberIsNotMultipleOf3r5Test2() {
        int number = 8;
        String multipleOfThree = "number";

        String multiple = FizzBuzzChallenge.convert(multipleOfThree, number);

        Assertions.assertThat(multiple).isEqualTo(String.valueOf(number));
    }





}
