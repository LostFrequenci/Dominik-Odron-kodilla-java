package com.kodilla.good.patterns.challenges.AirLines;

import java.util.Set;

public class Application {
    public static void main(String[] args) {
        FlightsList flightsList = new FlightsList();
        Set<Flight> list = flightsList.getFlightsList();

        System.out.println("");
        System.out.println("Founded flights : ");
        FlightSearcher user1 = new FlightSearcher();
        user1.searchFlightTo(list,"Boston");

        System.out.println("");
        System.out.println("Founded flights : ");
        FlightSearcher user2 = new FlightSearcher();
        user2.searchFlightFrom(list,"Boston");

        System.out.println("");
        System.out.println("Founded flights : ");
        FlightSearcher user3 = new FlightSearcher();
        user3.searchFlightWithChange(list,"Liverpool","Chicago");
    }
}
