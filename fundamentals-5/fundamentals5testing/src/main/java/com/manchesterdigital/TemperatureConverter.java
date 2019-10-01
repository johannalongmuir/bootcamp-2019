package com.manchesterdigital;

public class TemperatureConverter {
    // constants available to the class. Introduced as can update tests as well.
    public static final String CELCIUS_UNIT = "C";
    public static final String FAHRENHEIT_UNIT = "F";

    public static double convert(String unitToConvertTo, int temperature) {
        //add exception
        if (!unitToConvertTo.equalsIgnoreCase(CELCIUS_UNIT) &&
                !unitToConvertTo.equalsIgnoreCase(FAHRENHEIT_UNIT)) {
            throw new InvalidConversionUnitException("Provided invalid unit: " + unitToConvertTo);
        }


        if (unitToConvertTo.equalsIgnoreCase("C")) {
            return calculateFahrenheitToCelcius(temperature);
        }
        return calculateCelciusToFahrenheit(temperature);
    }

        /* origininal code for above before refactor
            if (unitToConvertTo.equalsIgnoreCase("C")) {
                 // add formula fahrenheight to celcius. Math library. .ceil rounds up .floor rounds down
               return Math.ceil((temperature - 32) * 5 / 9);
             }
            return (temperature  * 9/5) + 32; */

        // refactor below


    private static double calculateFahrenheitToCelcius(int fahrenheitValue) {
        return Math.ceil((fahrenheitValue - 32) * 5 / 9);
    }
    private static double calculateCelciusToFahrenheit(int celciusValue) {
        return (celciusValue * 9 / 5) + 32;
    }

}
