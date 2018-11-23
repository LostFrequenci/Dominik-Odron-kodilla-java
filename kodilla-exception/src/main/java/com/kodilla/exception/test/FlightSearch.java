package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class FlightSearch {

    public void findFlight (Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> enableFlights = new HashMap<>();

        enableFlights.put("Chicago",Boolean.TRUE);
        enableFlights.put("Warszawa",Boolean.TRUE);
        enableFlights.put("Moscow",Boolean.FALSE);

        String searchingAirpot = flight.getArrivalAirport();

        if(enableFlights.containsKey(searchingAirpot) == true) {
            System.out.println("You found flight to : " + searchingAirpot + ". Departure Airport is : " + flight.getDepartureAirport());
        } else {
            throw new RouteNotFoundException("Airport not found in list.");
        }

    }
}
