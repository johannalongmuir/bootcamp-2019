package com.manchesterdigital;

import java.util.Map;

public class FlightService {
    private static Map<String, FlightInformation> flights;

    // static block. Initilases anthing in static context before class goes into a method
    // sets this up first, is there anything in here that is static? yes? I'll set it up
    // then does instansiation of class, then goes what method are you calling.
    // Map.of can only get hold of flight number provided all capitiliased (assuming this at the moment)
    // finds that parameter for FlightInformation flightNumber form the class

    static {
        flights = Map.of(
                "AB123", new FlightInformation("AB123"),
                "XK345", new FlightInformation("XK345"),
                "ST009", new FlightInformation("ST009")
                );
    }

    // method to retrieve flight. Get using flightNo
    // can also not make this final, just String and in the flightNo.toUpperCase
    // hiding if someone else sending you the wrong information
    public FlightInformation retrieveFlight (final String flightNo) {
        return flights.get(flightNo);
    }


    /* good but not great

    public Airline retrieveAirline(final String flightNo) {
        FlightInformation flight = retrieveFlight(flightNo);

        if (!flight.getAirline().isPresent()) {
            throw new AirlineNotFoundException();
        }
        return flight.getAirline().get();
    }
     */

    public Airline retrieveAirline(final String flightNo) {
        FlightInformation flight = retrieveFlight(flightNo);
        // method reference, going into Airline Not Found Exception and creating a new instance of it
        return flight.getAirline().orElseThrow(AirlineNotFoundException::new);
        // lambda to return message
        // return flight.getAirline().orElseThrow(() -> new AirlineNotFoundException("No flight found"));
        // or below but will suggest you use the method reference instead of the lambda
        // return flight.getAirline().orElseThrow(() -> new AirlineNotFoundException());
        // or return empty one
        //return flight.getAirline().orElse(new Airline());
        // create own using .or can get it from another class or optional
        // return flight.getAirline().or(...add in here...)
    }

}
