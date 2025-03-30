package com.example.Strategy.SpotAssignment;

import com.example.model.ParkingFloor;
import com.example.model.ParkingSpot;
import com.example.model.Vehicle;

import java.util.List;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(List<ParkingFloor> parkingFloors, Vehicle vehicle);


}
