package com.manchesterdigital;

public class Lights implements Controls {


    @Override
    public void switchOn() {
        System.out.println("Pressing on switch....Lights on");

    }

    @Override
    public void switchOff() {
        System.out.println("Pressing off switch....Lights off");

    }
}
