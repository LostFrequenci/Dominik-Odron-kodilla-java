package com.kodilla.good.patterns.challenges.AirLines;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;

public class FlightSearcher {

    public void searchFlightTo(Set<Flight> flightsList,String arrivalAirport){

        List<Flight> flights1 = flightsList.stream()
                .filter(s -> s.getArrivalAirport().equals(arrivalAirport))
                .filter(s -> s.isChangePlane() == false)
                .collect(toList());

        if (flights1.size()>0) {
            flights1.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("No flights found");
        }
    }

    public void searchFlightFrom(Set<Flight> flightsList,String departureAirport){

        List<Flight> flights2 = flightsList.stream()
                .filter(s -> s.getDepartureAirport().equals(departureAirport))
                .filter(s -> s.isChangePlane() == false)
                .collect(toList());

        if (flights2.size()>0) {
            flights2.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("No flights found");
        }
    }

    public void searchFlightWithChange(Set<Flight> flightsList,String departureAirport, String arrivalAirport){

        List<Flight> flights3 = flightsList.stream()
                .filter(s -> s.getDepartureAirport().equals(departureAirport))
                .filter(s -> s.getArrivalAirport().equals(arrivalAirport))
                .filter(s -> s.isChangePlane() == true)
                .collect(toList());

        if (flights3.size()>0) {
            flights3.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("No flights found");
        }

    }
}
