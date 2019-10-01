package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class TestIntroduction {

    /* is technically correct but wordy.
    @Test
    public void testThatABankAccountTakesAnInputWhenDeposited() {
    }
    with the name starting with should, would know for e.g if bank account as would call Class BankAccount

    @Test

    public void shouldTakeInputWhenDeposited() {

    }

    /* BDD style below. Most common. Behavioural Driven Development. What Business Analysists use. Bacically story
       key words given, when, then
       follow pattern that company follows

    @Test
    public void givenBankAccountWhenInputThenDeposited() {
    }
    */

    /* when run test bring up new dialog window. Has come up with the numbers not comparing right
        will have a left hand side showing Class and the @Test methods. Right showing what checked
     */
    @Test
    public void shouldAddTwoNumbers() {
        // Arrange
        int first = 23;
        int second = 23;

        // Act. Intention of what I am trying to test
        int result = first + second;

        // Assert. Include assertions class. Where assertion.j.org that was downloaded.
        // Assertions.assertThat(result).isEqualTo(45); then do static inport from lightbulb

        assertThat(result).isEqualTo(46);

    }
}
