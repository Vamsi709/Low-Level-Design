package com.example;

import com.example.Controller.ParkingLotController;
import com.example.model.*;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ParkingLotController parkingLotController = new ParkingLotController;
        List< ParkingSpot> parkingSpots1  = new ArrayList<>();
        List< ParkingSpot> parkingSpots2  = new ArrayList<>();
        List< ParkingSpot> parkingSpots3 = new ArrayList<>();
        for(int i=1;i<=3;i++){
            parkingSpots1.add(new ParkingSpot(i, VehicleType.CAR,1));
        }
        for(int i=1;i<=3;i++){
            parkingSpots2.add(new ParkingSpot(i, VehicleType.BIKE,2));
        }
        for(int i=1;i<=3;i++){
            parkingSpots3.add(new ParkingSpot(i, VehicleType.TRUCK,3));
        }



        List< ParkingFloor> parkingFloors = new ArrayList<>();
        parkingFloors.add(new ParkingFloor(1,parkingSpots1));
        parkingFloors.add(new ParkingFloor(2,parkingSpots2));
        parkingFloors.add(new ParkingFloor(3,parkingSpots3));

        Address address = new Address(533102,100,200);
        Operator operator1 = new Operator(1,"Vamsi");
        Operator operator2 = new Operator(2,"Suraj");
        List<Gate> gates = new ArrayList<>();
        gates.add(new EntryGate(1,GateType.ENTRY,operator1));
        gates.add(new ExitGate(2,GateType.EXIT,operator2));

        ParkingLot parkingLot = parkingLotController.createParkingLot(parkingFloors,address,gates);
        List<ParkingFloor> parkingFloor = parkingLot.getParkingFloors();
        for(int i =0;i<parkingFloor.size();i++){
            List<ParkingSpot> parkingSpot = parkingFloor.get(i).getParkingSpots();
            System.out.println(parkingSpot);
        }


//        parkingLotController.assignSpot(Vehicle ,




    }
}