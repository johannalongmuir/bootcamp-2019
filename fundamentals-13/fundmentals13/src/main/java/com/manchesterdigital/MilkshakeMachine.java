package com.manchesterdigital;

public class MilkshakeMachine extends Machine implements HasMilk, Rotatable {
    // same as machine version
    public MilkshakeMachine(String manufacturer, String name, Colours colours) {
        super(manufacturer, name, colours);


    }

    @Override
    public void addMilk() {
        // can add anything as long as SRP. Only one thing add milk, or add butter.
        System.out.println("Adding milk to machine...");

    }

    @Override
    public void rotate(int num) {
        System.out.println("rotating " + num + " of times");

    }
}
