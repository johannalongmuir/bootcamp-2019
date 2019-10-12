package com.manchesterdigital;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnimalTypes {

    protected static List<String> animalTypes (Map<String, List> animalMap, String animalInput) {
        return animalMap.entrySet().stream()
                .filter(stringListEntry -> stringListEntry.getValue().contains(animalInput))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }


}
