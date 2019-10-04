package com.manchesterdigital;

public class Chicken extends Bird {

    public Chicken(Integer age, String gender, Integer weightInLbs, Integer wingSpan) {
        super(age, gender, weightInLbs, wingSpan);
    }

    public void move() {
        System.out.println("Im wadding...");

    }

    /* No longer need this as did the Flyable Interface
    @Override
    public void fly() {
        System.out.println("Errrm...I cant fly");
    }

     */

}

