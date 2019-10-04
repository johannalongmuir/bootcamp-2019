package com.manchesterdigital;

public abstract class Bird extends Animal {
    private Integer wingSpan;


    public Bird(Integer age, String gender, Integer weightInLbs, Integer wingSpan) {
        super(age, gender, weightInLbs);

    }

    /* Moved this to a Flyable Interface
    public void fly () {
        System.out.println("Flying...");
    }

     */


}
