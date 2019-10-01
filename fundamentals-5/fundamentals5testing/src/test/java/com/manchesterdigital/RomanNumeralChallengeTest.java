package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RomanNumeralChallengeTest {


    @Test
    public void convertNumberOneToI() {
        int number = 1;
        String roman = "I";

        String result = RomanNumeralChallenge.convert(number, roman);

        Assertions.assertThat(result).isEqualToIgnoringCase("I");

    }
    @Test
    public void convertNumberTenToX() {
        int number = 10;
        String roman = "X";

        String result = RomanNumeralChallenge.convert(number, roman);

        Assertions.assertThat(result).isEqualToIgnoringCase("X");

    }

    @Test
    public void convertNumbersLessThanFourEG2ToII() {
        int number = 2;
        String roman = "I";

        String result = RomanNumeralChallenge.convert(number, roman);

        Assertions.assertThat(result).isEqualToIgnoringCase( roman + roman);
    }

}
