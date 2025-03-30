package com.example.Factory;

import com.example.model.Bike;
import com.example.model.Car;
import com.example.model.Truck;
import com.example.model.Vehicle;

public class VehicleFactory {
    private static Vehicle getVehicle(String type,long number){
        switch (type.toLowerCase()){
            case "car":
                return new Car(number);
            case "bike":
                return new Bike(number);
            case "truck":
                return new Truck(number);
            default:
                throw new IllegalArgumentException("Pls enter valid value to create object");
        }
    }
}
