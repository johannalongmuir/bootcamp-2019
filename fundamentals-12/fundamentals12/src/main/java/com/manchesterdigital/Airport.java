package com.manchesterdigital;

import java.util.Optional;

public class Airport {
    public static void main(String[] args) {

        FlightService flightService = new FlightService();

        FlightInformation flight = flightService.retrieveFlight("AB123");

        // will get null at this point as not set up airline object
        System.out.println("flight = " + flight.getAirline().get());


        // may have a flight info which could be null: preferred option. Still control over the null.
        Optional<FlightInformation> flight1 = Optional.of(flight);

        // Optional of value maybe null but not too bothered: This hides bugs!
        Optional<FlightInformation> flight2 = Optional.ofNullable(flight);
    }


}
