package com.example.model;

public abstract class Vehicle {
    private long number;
    private VehicleType vehicleType;

    public Vehicle(long number, VehicleType vehicleType) {
        this.number = number;
        this.vehicleType = vehicleType;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
