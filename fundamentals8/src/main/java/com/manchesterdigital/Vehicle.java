package com.manchesterdigital;

public abstract class Vehicle {

    private final String colour;
    private final Integer numberOfSeats;
    //enum for TransmissionType
    private final TransmissionType transmissionType;
    private final Double engineSize;
    private final String manufacturer;

    public Vehicle(String colour, Integer numberOfSeats,
                   TransmissionType transmissionType, Double engineSize,
                   String manufacturer) {
        this.colour = colour;
        this.numberOfSeats = numberOfSeats;
        this.transmissionType = transmissionType;
        this.engineSize = engineSize;
        this.manufacturer = manufacturer;
    }

    // public abstract void superCharger();

}
