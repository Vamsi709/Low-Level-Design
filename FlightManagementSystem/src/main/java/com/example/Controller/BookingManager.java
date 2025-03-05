package com.example.Controller;

import com.example.model.*;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class BookingManager {
    private volatile static BookingManager instance = null;
    private final ConcurrentHashMap<String, Booking> bookings = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Seat, ReentrantLock> seatLocks = new ConcurrentHashMap<>();


    public static BookingManager getInstance() {
        if (instance == null) {
            synchronized (BookingManager.class) {
                if (instance == null) {
                    instance = new BookingManager();
                }
            }
        }
        return instance;
    }

    public  boolean createBooking(User user, List<FlightSeat> seats) {
        boolean allSeatsBooked = true; // Track if all seats are successfully booked

        for (FlightSeat seat : seats) {
            ReentrantLock seatLock = seatLocks.computeIfAbsent(seat.getSeat(), k -> new ReentrantLock());
            boolean seatBooked = false;

            try {
                if (seatLock.tryLock()) { // Try to acquire the lock
                    try {
                        if (seat.getSeatStatus() == SeatStatus.NOTBOOKED) {
                            seat.setSeatStatus(SeatStatus.BOOKED);
                            System.out.println("Seat " + seat.getSeat() + " booked successfully.");
                            seatBooked = true;
                        } else {
                            System.out.println("Seat " + seat.getSeat() + " is already booked.");
                        }
                    } finally {
                        seatLock.unlock();
                        // 🧹 Clean up lock if not needed
                    }
                } else {
                    System.out.println("Seat " + seat.getSeat().getNumber()+ " is locked by another user.");
                    allSeatsBooked = false;
                }
            } catch (Exception e) { // Catch unexpected errors
                e.printStackTrace();
                allSeatsBooked = false;
            }
        }

        return allSeatsBooked; // Return true if all seats were booked, false otherwise
    }


}
