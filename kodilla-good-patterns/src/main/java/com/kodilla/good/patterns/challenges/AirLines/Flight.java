package com.kodilla.good.patterns.challenges.AirLines;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Flight {

    private String arrivalAirport;
    private String departureAirport;
    private boolean changePlane;
    private LocalDateTime flightDate;

    public Flight(String arrivalAirport, String departureAirport, boolean changePlane, int year, int month, int day , int hour, int minute) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
        this.changePlane = changePlane;
        this.flightDate = LocalDateTime.of(year,month,day,hour,minute);
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public boolean isChangePlane() {
        return changePlane;
    }

    public LocalDateTime getFlightDate() {
        return flightDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return isChangePlane() == flight.isChangePlane() &&
                Objects.equals(getArrivalAirport(), flight.getArrivalAirport()) &&
                Objects.equals(getDepartureAirport(), flight.getDepartureAirport()) &&
                Objects.equals(getFlightDate(), flight.getFlightDate());
    }

    @Override
    public int hashCode() {
        int result = departureAirport != null ? departureAirport.hashCode() : 0;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (flightDate != null ? flightDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = flightDate.format(formatter);
        return "Flight from : " + departureAirport +
                ", destination airport : " + arrivalAirport +
                ", date and time of flight : " + formatDateTime +
                ", flight with changes : " + changePlane;
    }



}
