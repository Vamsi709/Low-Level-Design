package com.example.model;

import java.util.List;

public class Flight {
    private String source;
    private String destination;
    private Long flightId;
    private List<FlightSeat> flightSeats;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Flight(List<FlightSeat> flightSeats) {
        this.flightSeats = flightSeats;
    }

    public List<FlightSeat> getFlightSeats() {
        return flightSeats;
    }

    public void setFlightSeats(List<FlightSeat> flightSeats) {
        this.flightSeats = flightSeats;
    }


}
