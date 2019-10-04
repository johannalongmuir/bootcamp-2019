package com.manchesterdigital;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {

        /* This Made Animal Abstract so cannot make new instace of this yet
            // new instance of animal
            Animal animal = new Animal(20, "Female", 100);

             // behaviours
             animal.eat();
             animal.sleep();

        Bird bird = new Bird(20, "Male", 30, 3);
        bird.eat();

         */

        Chicken bernardMatthews = new Chicken(23, "Female", 15, 10);
        bernardMatthews.move();
        bernardMatthews.eat();
        bernardMatthews.sleep();

        Magpie maggie = new Magpie(34, "Male", 50, 30);

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(maggie);
        animals.add(bernardMatthews);

        for(Animal animal : animals) {
            animal.move();
        }

        Flyable someAnimalThatFlies = new Magpie(34, "Male", 50, 30);

        List<Flyable> flyables = new ArrayList<>();
        flyables.add(maggie);
        // flyables.add(bernardMatthews); Not an implementor of Flyable so cannot be selected

    }

}
