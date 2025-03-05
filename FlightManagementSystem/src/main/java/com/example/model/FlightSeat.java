package com.example.model;

public class FlightSeat {
    private Flight flight;
    private Seat seat;
    private SeatStatus seatStatus;

    public FlightSeat(Seat seat,SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
        this.seat = seat;
    }



    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}
