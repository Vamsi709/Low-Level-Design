package com.example.model;

public class FlightSeatType {
    private Flight flight;
    private SeatType seatType;
    private double price;

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public FlightSeatType(Flight flight, SeatType seatType, double price) {
        this.flight = flight;
        this.seatType = seatType;
        this.price = price;
    }
}
