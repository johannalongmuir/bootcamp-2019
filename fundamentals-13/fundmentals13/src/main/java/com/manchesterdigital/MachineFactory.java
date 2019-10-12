package com.manchesterdigital;

import java.util.List;

public class MachineFactory {
    // artificial, give it info and provides machine of that type
    // polymorphism.
    // milkshake machine extends machine so can be returned as Machine type

    public static Machine getMachine(boolean usesMilk) {
        if(usesMilk) {
            return new MilkshakeMachine("milky", "milk", Colours.RED);
        }
        return new FoodProcessor("foody", "food", Colours.BLUE, List.of("apple", "pear"));
    }

    // polymorphic, as both use Rotatable,
    public static Rotatable getMachineByRotation(boolean usesMilk) {
        if (usesMilk) {
            return new MilkshakeMachine("milky", "milk", Colours.RED);
        }
        return new FoodProcessor("foody", "food", Colours.BLUE, List.of("apple", "pear"));
        }

    }


