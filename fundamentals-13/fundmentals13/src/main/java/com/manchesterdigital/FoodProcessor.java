package com.manchesterdigital;

import java.util.List;

public class FoodProcessor extends Machine implements BlendsFood, Rotatable {
    // add it in the Food Processor constructor, will ask to bind. Extend constuctor
    private final List<String> ingredients;

    public FoodProcessor(String manufacturer, String name, Colours colours, List<String> ingredients) {
        super(manufacturer, name, colours);
        this.ingredients = ingredients;
    }

    @Override
    public void mixFoodContents() {
        ingredients.stream()
                .forEach(ingredient -> System.out.println("Mixing " + ingredient));

    }


    @Override
    public void rotate(int num) {
        System.out.println("rotating " + num + " of times");
    }
}
