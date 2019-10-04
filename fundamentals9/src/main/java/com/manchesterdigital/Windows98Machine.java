package com.manchesterdigital;

public class Windows98Machine {
    private final Keyboard keyboard;
    private final Monitor monitor;


    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    /* Constructor this will work but its now tightly coupled to everything else as used new.
     Constructor not contain anything so cannot change anything if you want to
     Improve this by future proof. Refactored by making Keyboard interface and updating
       private final Keyboard keyboard;

    public Windows98Machine(){
        standardKeyboard = new StandardKeyboard();
        monitor = new Monitor();

    }

     */

}

