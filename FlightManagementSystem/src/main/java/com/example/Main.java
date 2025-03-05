package com.example;

import com.example.Controller.BookingManager;
import com.example.model.FlightSeat;
import com.example.model.Seat;
import com.example.model.SeatStatus;
import com.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookingManager bookingManager = BookingManager.getInstance(); // Singleton
        List<FlightSeat> flightSeats = new ArrayList<>();

        // Creating flight seats
        flightSeats.add(new FlightSeat(new Seat("A1"), SeatStatus.NOTBOOKED));
        flightSeats.add(new FlightSeat(new Seat("A2"), SeatStatus.NOTBOOKED));
        flightSeats.add(new FlightSeat(new Seat("A3"), SeatStatus.NOTBOOKED));
        flightSeats.add(new FlightSeat(new Seat("B1"), SeatStatus.NOTBOOKED));

        // Creating multiple user threads
        List<Thread> userThreads = new ArrayList<>();

        for (int i = 1; i <= 5; i++) { // 5 users trying to book
            int userId = i;
            Thread thread = new Thread(() -> {
                User user = new User(userId);
                boolean success = bookingManager.createBooking(user, flightSeats);
                System.out.println("User " + userId + (success ? " successfully booked a seat!" : " failed to book."));
            });
            userThreads.add(thread);
        }

        // Start all threads
        for (Thread thread : userThreads) {
            thread.start();
        }

        // Wait for all threads to finish
        for (Thread thread : userThreads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Final seat statuses
        System.out.println("\nFinal Seat Statuses:");
        for (FlightSeat seat : flightSeats) {
            System.out.println("Seat " + seat.getSeat().getNumber() + " - " + seat.getSeatStatus());
        }
    }
}
