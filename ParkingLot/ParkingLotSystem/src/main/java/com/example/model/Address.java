package com.example.model;

public class Address {
    private long pincode;
    private double latitude;
    private double longitude;

    public Address(long pincode, double latitude, double longitude) {
        this.pincode = pincode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getPincode() {
        return pincode;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
