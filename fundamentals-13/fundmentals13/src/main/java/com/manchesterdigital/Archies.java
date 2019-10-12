package com.manchesterdigital;

import java.util.List;

public class Archies {
    public static void main(String[] args) {

        // Machine machine = new Machine("zanussi", "mega", Colours.BLUE);
        // System.out.println("machine.toString() = " + machine.toString());

        MilkshakeMachine milkshakeMachine = new MilkshakeMachine("sony", "smoothie", Colours.PINK);
        System.out.println("milkshakeMachine.toString() = " + milkshakeMachine.toString());
        milkshakeMachine.putInChiller(); // default method from the Implimentor


        List<String> ingredients = List.of("carrots", "bananas");
        FoodProcessor foodProcessor = new FoodProcessor("samsung", "blender", Colours.RED, ingredients);

        System.out.println("foodProcessor = " + foodProcessor.toString());
        foodProcessor.mixFoodContents();

        Machine machine = MachineFactory.getMachine(true);
        System.out.println("machine = " + machine);

        Rotatable machineByRotation = MachineFactory.getMachineByRotation(false);
        // canot get name etc as gets you a type based on rotatable

        machineByRotation.rotate(5);


    }
}
