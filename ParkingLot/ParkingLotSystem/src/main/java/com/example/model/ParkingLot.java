package com.example.model;

import com.example.Controller.ParkingLotController;
import com.example.Strategy.SpotAssignment.SpotAssignmentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private long id;
    private List<ParkingFloor> parkingFloors;
    private Address address;
    private List<Gate> gates;
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private static ParkingLotController instance = null;


    private ParkingLot(ParkingLotBuilder parkingLotBuilder) {
        this.id = parkingLotBuilder.id;
        this.parkingFloors = (parkingLotBuilder.parkingFloors!=null)?parkingLotBuilder.parkingFloors:new ArrayList<>();
        this.address = parkingLotBuilder.address;
        this.gates = (parkingLotBuilder.gates!=null)?parkingLotBuilder.gates:new ArrayList<>();
        this.spotAssignmentStrategy = parkingLotBuilder.spotAssignmentStrategy;
    }

    public static ParkingLot getInstance(){
        if (instance==null){
            synchronized (ParkingLot.class){
                if (instance==null){
                    instance = new ParkingLot();
                }
            }
        }
        return instance;
    }

    public static ParkingLotBuilder create(){
        return new ParkingLotBuilder();
    }

    public long getId() {
        return id;
    }

    public SpotAssignmentStrategy getSpotAssignmentStrategy() {
        return spotAssignmentStrategy;
    }

    public Address getAddress() {
        return address;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }




    public List<Gate> getGates() {
        return gates;
    }

    public static class ParkingLotBuilder {
        private long id;
        private List<ParkingFloor> parkingFloors = new ArrayList<>(); // Initialize list
        private Address address;
        private List<Gate> gates = new ArrayList<>();
        private SpotAssignmentStrategy spotAssignmentStrategy;

        public ParkingLotBuilder setId(long id) {
            this.id = id;
            return this;
        }

        public ParkingLotBuilder setParkingFloors(List<ParkingFloor> parkingFloors) {
            this.parkingFloors = new ArrayList<>(parkingFloors); // Defensive copy
            return this;
        }

        // ✅ New method: Add a single floor dynamically
        public ParkingLotBuilder addParkingFloor(ParkingFloor floor) {
            if (floor != null) {
                this.parkingFloors.add(floor);
            }
            return this;
        }

        public ParkingLotBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }


        public ParkingLotBuilder setGates(List<Gate> gates) {
            this.gates = new ArrayList<>(gates); // Defensive copy
            return this;
        }

        public ParkingLotBuilder setSpotAssignmentStrategy(SpotAssignmentStrategy spotAssignmentStrategy) {
            this.spotAssignmentStrategy = spotAssignmentStrategy;
            return this;
        }

        public ParkingLot build() {
            return new ParkingLot(this);
        }
    }
}
