package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Szczecin","Warszawa");
        Flight flight2 = new Flight("Szczecin","Krakow");
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found at the list, " +
                    "but program still running!");
        }

        System.out.println("Processing other logic!");
    }
}
