package com.example.model;

public class Booking {
    private double BookingId;
    private BookingStatus bookingStatus;
    private double amount;
    private Flight flight;
    private Seat seat;
    private User user;

    public Booking(double bookingId, User user, Seat seat, BookingStatus status, double amount, Flight flight) {
        BookingId = bookingId;
        this.user = user;
        this.seat = seat;
        this.bookingStatus = BookingStatus.CONFIRMED;
        this.amount = amount;
        this.flight = flight;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public double getBookingId() {
        return BookingId;
    }

    public void setBookingId(double bookingId) {
        BookingId = bookingId;
    }
}
