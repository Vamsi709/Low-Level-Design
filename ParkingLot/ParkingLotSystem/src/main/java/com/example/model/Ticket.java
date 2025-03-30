package com.example.model;

import java.time.LocalDateTime;

public class Ticket {
    private int id;
    private ParkingSpot parkingSpot;
    private LocalDateTime entryTime;
    private Operator generatedBy;
    private Gate entryGate;
    private Vehicle vehicle;

    public Ticket(int id, ParkingSpot parkingSpot, LocalDateTime entryTime, Vehicle vehicle, Gate entryGate, Operator generatedBy) {
        this.id = id;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.entryGate = entryGate;
        this.generatedBy = generatedBy;
    }

    public int getId() {
        return id;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
