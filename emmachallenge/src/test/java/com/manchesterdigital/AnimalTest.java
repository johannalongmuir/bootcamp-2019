package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class AnimalTest {
    /* When given animal, return properties or sound it makes
    getFoodType Herbivore, omnivore, Carnivore?
    getSoundType
    Lions, Hippo, Elephant, Tucan, Pelican, Giraffe, Seal
    Can set up Map with Carnivore, Omnivore, Herbivore
    Each has an array with a list of animals in it
    Carnivore - CarnivoreAnimals (List is Lion, Tiger)
    Omnivore - OmnivoreAnimals
     */

    @Test
    public void whenSelectLionReturnCarnivore() {
        List<String> carnivoreList = List.of("Lion", "Tiger", "Cat");
        List<String> herbivoreList = List.of("Hippo", "Cow");
        List<String> omnivoreList = List.of("Dog");
        Map<String, List> animalMap = new HashMap<>();
        animalMap.put("Carnivore", carnivoreList);
        animalMap.put("Herbivore", herbivoreList);
        animalMap.put("Omnivore", omnivoreList);

        String animalInput = "Lion";

        List<String> result = AnimalTypes.animalTypes(animalMap, animalInput);

        Assertions.assertThat(result).contains("Carnivore");
    }

}
