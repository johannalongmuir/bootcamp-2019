package com.manchesterdigital;

public class ElectricCar implements MoveVehicle {
    private Engine engine;

    /*Changed to impliment MoveVehicle instead of car
    @Override
    public void startEngine(){
        throw new UnsupportedOperationException("Erm Im engine-less");
    }

     */

    @Override
    public void accelerate(){
        engine.powerOn(3000);
    }

}
