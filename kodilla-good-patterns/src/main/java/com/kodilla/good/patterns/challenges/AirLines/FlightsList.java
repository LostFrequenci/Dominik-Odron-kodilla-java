package com.kodilla.good.patterns.challenges.AirLines;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class FlightsList {

    private Set<Flight> flightsList = new HashSet<>();

    public Set<Flight> getFlightsList() {
        flightsList.add(new Flight("New York","Boston",false,2018,2,21,7,30));
        flightsList.add(new Flight("New York","Boston",false,2018,2,21,12,15));
        flightsList.add(new Flight("New York","Boston",false,2018,4,13,21,0));
        flightsList.add(new Flight("New York","Krakow",true,2018,2,4,7,30));
        flightsList.add(new Flight("Chicago","Liverpool",false,2018,6,13,11,25));
        flightsList.add(new Flight("Chicago","Liverpool",true,2018,6,1,7,30));
        flightsList.add(new Flight("Boston","New York",false,2018,2,21,7,30));
        flightsList.add(new Flight("Barcelona","Boston",false,2018,9,14,7,30));
        flightsList.add(new Flight("Boston","Krakow",false,2018,2,21,9,30));
        flightsList.add(new Flight("Barcelona","Krakow",false,2018,2,21,15,30));

        return new HashSet<>(flightsList);

    }


}
