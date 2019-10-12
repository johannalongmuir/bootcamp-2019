package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstrumentsTest {

    /* when input instrument type return what kind of instrument it is. Guitar eg Strings, Trumpet = brass

     */
    @Test
    public void whenSelectViolinReturnString() {
        List<String> stringInstrument = List.of("Vioin", "Cello", "Viola");
        Map<String, List> animalMap = new HashMap<>();
        animalMap.put("String Instrument", stringInstrument);

        String instrumentInput = "Violin";

       // Instruments.instrumentType(stringInstrument, instrumentInput);

        //Assertions.assertThat(result).contains("Violin");
    }


}
