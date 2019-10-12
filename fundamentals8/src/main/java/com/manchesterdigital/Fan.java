package com.manchesterdigital;

public class Fan implements Controls {

    @Override
    public void switchOn() {
        System.out.println("Turning dial on....fan on");

    }

    @Override
    public void switchOff() {
        System.out.println("Turning dial off....fan off");

    }
}
