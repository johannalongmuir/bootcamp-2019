package com.manchesterdigital;

public class EnumExamples {
    public static void main(String[] args) {

        // print out names.
        for (Colours value : Colours.values()) {
            System.out.println("value = " + value);
        }

        System.out.println("Dishes.MEXICAN.getDishName() = " + Dishes.MEXICAN.getDishName());
        System.out.println("Dishes.MEXICAN.getHeatLevel() = " + Dishes.MEXICAN.getHeatLevel());

        String dishName = "Tacos";

        Dishes retrievedDish = Dishes.retrievedByDishName(dishName);
        System.out.println("retrievedDish = " + retrievedDish);

    }

}
