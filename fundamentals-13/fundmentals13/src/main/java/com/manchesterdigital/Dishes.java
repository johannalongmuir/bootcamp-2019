package com.manchesterdigital;

import java.util.List;
import java.util.Map;

public enum Dishes {
    // best pratice enum is CAPITAL FOR VALUE, start with MEXICAN("Tacos")
    // bit like a key pair value.
    // Mexican is way of getting to it but dish is in the ()
    // bit like a dynamic map
    // adding heat type. Use constructor
    MEXICAN("Tacos", 90),
    INDIAN("Daal", 70),
    FRENCH("Snails", 0),
    GERMAN("Bratwurst", 100);


    private static Map<Dishes, String> dishesToDishNameMap;
    static {
        dishesToDishNameMap = Map.of(
                MEXICAN, "Tacos",
                INDIAN, "Daal",
                FRENCH, "Snails",
                GERMAN, "Bratwurst"
        );
    }


    // default constructor. Have to access in static way using class name
    // defined above, but not actually make until need it
    // final as need them!

    private final String dishName;
    private final Integer heatLevel;
    Dishes(String dishName, Integer heatLevel) {
        this.dishName = dishName;
        this.heatLevel = heatLevel;
    }

    // getter
    public String getDishName() {
        return dishName;
    }

    public Integer getHeatLevel() {
        return heatLevel;
    }

    public static Dishes retrievedByDishName (String requiredDishName) {
        /*if (dishesToDishNameMap.containsValue(requiredDishName)) {
            return dishesToDishNameMap.entrySet()
                    .stream()
                    .filter(dishesStringEntry -> dishesStringEntry.getValue()
                            .equalsIgnoreCase(requiredDishName))
                    .findFirst()
                    .get()
                    .getKey();
        }

        return null;

         */
        return dishesToDishNameMap.entrySet()
                .stream()
                .filter(dishesStringEntry -> dishesStringEntry.getValue()
                        .equalsIgnoreCase(requiredDishName))
                .findFirst().orElseThrow(IllegalStateException::new)
                .getKey();

    }
}
