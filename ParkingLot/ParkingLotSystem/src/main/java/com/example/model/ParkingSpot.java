package com.example.model;

public class ParkingSpot {
    private int spotNumber;
    private VehicleType spotType;
    private boolean isAvailable;
    private int FloorNumber;

    public ParkingSpot(int spotNumber, VehicleType spotType, int floorNumber) {
        this.spotNumber = spotNumber;
        this.spotType = spotType;
        this.isAvailable = true;
        this.FloorNumber = floorNumber;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public int getFloorNumber() {
        return FloorNumber;
    }

    public VehicleType getSpotType() {
        return spotType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
