package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MegaBytesToKiloBytesTest {



    @Test
    public void whenKiloByteIs1024Return1MegaBytes() {
        // Assert
        int bytes = 1024;
        String unitToConvertTo = "MB";

        // Act

        String result = MegaBytesToKiloBytes.convert(unitToConvertTo, bytes);

        // Arrange
        Assertions.assertThat(result).isEqualTo("1MB + 0KB");

    }

    @Test
    public void whenKiloByteIs2048Return2MegaBytes() {
        // Assert
        int bytes = 2048;
        String unitToConvertTo = "MB";

        // Act

        String result = MegaBytesToKiloBytes.convert(unitToConvertTo, bytes);

        // Arrange
        Assertions.assertThat(result).isEqualTo("2MB + 0KB");

    }

    @Test
    public void whenKiloByteIs3074Return3MegaBytesAnd2KiloBytes() {
        // Assert
        int bytes = 3074;
        String unitToConvertTo = "MB";

        // Act

        String result = MegaBytesToKiloBytes.convert(unitToConvertTo, bytes);

        // Arrange
        Assertions.assertThat(result).isEqualTo("3MB + 2KB");

    }

    @Test
    public void whenMegaByteIsAddedReturnWrongUnitType() {
        // Assert
        int bytes = 3074;
        String unitToConvertTo = "KB";

        // Act

        String result = MegaBytesToKiloBytes.convert(unitToConvertTo, bytes);

        // Arrange
        Assertions.assertThat(result).isEqualTo("Wrong unit type");

    }

    @Test
    public void whenKiloByteIs15596Return15MegaBytesAnd236KiloBytes() {
        // Assert
        int bytes = 15596;
        String unitToConvertTo = "MB";

        // Act

        String result = MegaBytesToKiloBytes.convert(unitToConvertTo, bytes);

        // Arrange
        Assertions.assertThat(result).isEqualTo("15MB + 236KB");

    }




    /*
    @Test
    public void whenMegaByteIsOneReturn1024KiloBytes() {
        // Assert
        int bytes = 1;
        String unitToConvertTo = "KB";

        // Act

        int result = MegaBytesToKiloBytes.convert(unitToConvertTo, bytes);

        // Arrange
        Assertions.assertThat(result).isEqualTo(1024);

    }

    @Test
    public void whenMegaByteIsTwoReturn2048KiloBytes() {
        // Assert
        int bytes = 2;
        String unitToConvertTo = "KB";

        // Act

        int result = MegaBytesToKiloBytes.convert(unitToConvertTo, bytes);

        // Arrange
        Assertions.assertThat(result).isEqualTo(2048);

    }

    @Test
    public void whenMegaByteIsFiveReturn5120KiloBytes() {
        // Assert
        int bytes = 5;
        String unitToConvertTo = "KB";

        // Act

        int result = MegaBytesToKiloBytes.convert(unitToConvertTo, bytes);

        // Arrange
        Assertions.assertThat(result).isEqualTo(5120);

    }

 */
}
