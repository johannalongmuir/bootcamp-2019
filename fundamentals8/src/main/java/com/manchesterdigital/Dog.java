package com.manchesterdigital;

public class Dog {

    // Characteristics = height, weight, breed, number of teeth
    // Best practice to use wrapper class so all the same
    // can have as many properties here but do want to consolidate
    private String breed;
    private Integer age;
    private Integer tailLength;
    private Integer numberOfTeeth;
    private Integer numberOfLegs;
    private DogSize dogSize;

    // Behaviours
    private Integer aggressionLevel;
    private Integer hungerLevel;

    // Constructor
    public Dog(DogSize dogSize) {
        this.dogSize = dogSize;
    }

    // first function
    public void bark (){
        System.out.println(dogSize.getNoise());

    }

    public void hungry(){
        if (hungerLevel > 10) {
            for (int i = 0; i <10; i++) {
                bark();
            }

            System.out.println("Gimme foood!!! " + dogSize.getNoise());
        }
        else {
            System.out.println("I'm stuffed");
        }
    }

    // Setters to set hunger Level etc
    public void setHungerLevel(Integer hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setTailLength(Integer tailLength) {
        this.tailLength = tailLength;
    }
}
