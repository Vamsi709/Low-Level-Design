package com.example.Strategy.SpotAssignment;

import com.example.model.ParkingFloor;
import com.example.model.ParkingSpot;
import com.example.model.Vehicle;

import java.util.List;

public class NearestSpotAssignmentStrategy implements SpotAssignmentStrategy{
    @Override
    public ParkingSpot assignSpot(List<ParkingFloor> parkingFloors, Vehicle vehicle) {
        for (ParkingFloor floor:parkingFloors){
           for(ParkingSpot spot: floor.getParkingSpots()){
               if (spot.isAvailable() && spot.getSpotType().equals(vehicle.getVehicleType()))
               {
                   return spot;
               }
           }

        }
        return null;
    }
}
