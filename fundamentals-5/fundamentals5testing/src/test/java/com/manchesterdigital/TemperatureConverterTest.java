package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TemperatureConverterTest {

    // did this near the end for better practice version of Exception test
    // static method returning an instance of an expected Exception class. Could use lightbulb and do static import

    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    /*
     First unit test. In main initially just return -17.
                Example of test in case refactor and lose it
                    @Test
                    public void whenFahrenheitIsZeroThenCelciusIsMinus17() {
                         // Arrange
                         String unitToConvertTo = "C";
                         int temperature = 0;
                         // Act
                         double result = TemperatureConverter.convert(unitToConvertTo, temperature);

                         // Assert
                         Assertions.assertThat(result).isEqualTo(-17.0);
                        }
     */

    @Test
    public void whenFahrenheitIsZeroThenCelciusIsMinus17() {
        // Arrange
        String unitToConvertTo = "C";
        int temperature = 0;

        // Act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        // Assert
        Assertions.assertThat(result).isEqualTo(-17.0);
    }

    // unit second test

    @Test
    public void whenFahrenheitIs100ThenCelciusIs37() {
        // Arrange
        String unitToConvertTo = "C";
        int temperature = 100;

        // Act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        // Assert
        Assertions.assertThat(result).isEqualTo(37.0);
    }

    // third test
    @Test
    public void whenFahrenheitIs50ThenCelciusIs10() {
        // Arrange
        String unitToConvertTo = "C";
        int temperature = 50;

        // Act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        // Assert
        Assertions.assertThat(result).isEqualTo(10.0);

    }

    // --------- CELCIUS TO FAHRENHEIGHT (Do't have to do this but can be helful as a line break.
    // Can also to 2 test files if its going too big. E.g Celcius to F, then F to C)


    @Test
    public void whenCelciusIs0ThenFahrenheitIs32() {
        // Arrange
        String unitToConvertTo = "F";
        int temperature = 0;

        // Act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        // Assert
        Assertions.assertThat(result).isEqualTo(32.0);
    }

    @Test
    public void whenCelciusIs35ThenFahrenheitIs95() {
        // Arrange
        String unitToConvertTo = "F";
        int temperature = 35;

        // Act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        // Assert
        Assertions.assertThat(result).isEqualTo(95.0);
    }

    @Test (expected = InvalidConversionUnitException.class)
    public void whenConversionUnitIsNotValidThenExceptionThrown() {
        TemperatureConverter.convert("gifgisdsfhgf", 0);
    }

    // better practice of above
    @Test
    public void whenConversionUnitIsNotValidThenExceptionThrown2() {
        //keeps an eye on that logic. Look out for invalid exception and will hold onto if it does
        expectedException.expect(InvalidConversionUnitException.class);

        // can check the message is what expected as well
        // expectedException.expectMessage("Provided invalid unit: gifgisdsfhgf");

        TemperatureConverter.convert("gifgisdsfhgf", 0);

        Assertions.assertThat(expectedException).isInstanceOf(InvalidConversionUnitException.class);
    }
}
