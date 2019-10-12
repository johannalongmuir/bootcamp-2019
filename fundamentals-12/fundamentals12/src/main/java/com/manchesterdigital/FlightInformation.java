package com.manchesterdigital;

import java.util.Optional;

/**
 * POJO for flight info
 * Uses another Object (Airline)
 * At the moment hope that Airline + destination is set already!
 *
 */

public class FlightInformation {
    private final String flightNumber;
    private String destination;
    private Optional<Airline> airline;

    // has an airline relationship not is a


    // constructor
    public FlightInformation(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    // if do all auto getter/setter not make a set FlightNumber as have the constructor
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    public Optional<Airline> getAirline() {
        return airline;
    }

    public void setAirline(Optional<Airline> airline) {
        this.airline = airline;
    }
}
