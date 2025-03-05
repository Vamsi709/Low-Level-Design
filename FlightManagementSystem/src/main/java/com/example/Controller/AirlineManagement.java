package com.example.Controller;

import com.example.model.*;

import java.util.ArrayList;
import java.util.List;

public class AirlineManagement {
    private List<Flight> flights;
    private final FlightSearch flightSearch;
    private  final BookingManager bookingManager;

    public AirlineManagement() {
        this.flightSearch = new FlightSearch(flights);
        this.bookingManager = BookingManager.getInstance();
        this.flights  = new ArrayList<>();
    }

    public void add(Flight flight){
        flights.add(flight);

    }

    public void remove(Flight flight){
        flights.remove(flight);
    }

    public void searchFlights(String source,String destination){
        flightSearch.flightSearch(source,destination);
    }

    public void  BookFlight( User user, List<FlightSeat> seats){
        bookingManager.createBooking(user,seats);
    }
}
