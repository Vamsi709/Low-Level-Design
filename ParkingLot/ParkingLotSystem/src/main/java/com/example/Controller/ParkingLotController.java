package com.example.Controller;

import com.example.Strategy.SpotAssignment.NearestSpotAssignmentStrategy;
import com.example.Strategy.SpotAssignment.SpotAssignmentStrategy;
import com.example.model.*;

import java.time.LocalDateTime;
import java.util.List;

public class ParkingLotController {



    public ParkingLot createParkingLot(List<ParkingFloor> parkingFloors, Address address, List<Gate> gates){

        ParkingLot parkingLot =   ParkingLot.create().setParkingFloors(parkingFloors).
                setId(1).setAddress(address).setGates(gates).setSpotAssignmentStrategy(new NearestSpotAssignmentStrategy()).build();

        System.out.println("parkingLot is been Successfully created");
        return parkingLot;


    }

    public ParkingSpot AssignSpot(Vehicle vehicle){
        ParkingLot parkingLot = ParkingLot.getInstance();
        ParkingSpot parkingSpot = parkingLot.getSpotAssignmentStrategy().assignSpot(parkingLot.getParkingFloors(),vehicle);
        return parkingSpot;

    }






    public Ticket issueTicket(int id,Vehicle vehicle,Gate gate,Operator operator){
        ParkingSpot parkingSpot1 = AssignSpot(vehicle);
        System.out.println("Assigned Spot is"+parkingSpot1);
        Ticket ticket = new Ticket(id, parkingSpot1, LocalDateTime.now(),vehicle, gate, operator);
        System.out.println("Ticket issued SuccessFully");
        return ticket;

    }

    public Bill issueBill(Ticket ticket,int amounttobePaid, Operator operator){
        Bill bill = new Bill(ticket,LocalDateTime.now(), amounttobePaid, operator);
        System.out.println("Bill Issued to Customer Successfully");
        return bill;
    }




}
