package parkinglot;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Alka Kumari
 * @version 05/01/22
 */
public class ParkingMain {

  public static void main(String[] args) throws InterruptedException {

    String nameOfLot = "Forum Parking Lot";
    Address address = Address.builder()
        .block("4th Block")
        .city("bangalore")
        .country("India")
        .pin("560068")
        .build();

    Map<ParkingSlotType, Map<String, ParkingSlot>> allSlots = new HashMap<>();

    Map<String, ParkingSlot> compactSlot = new HashMap<>();
    compactSlot.put("C1", new ParkingSlot("S1", ParkingSlotType.Compact));
    compactSlot.put("C2", new ParkingSlot("S2", ParkingSlotType.Compact));
    compactSlot.put("C3", new ParkingSlot("S3", ParkingSlotType.Compact));
    allSlots.put(ParkingSlotType.Compact, compactSlot);

    Map<String, ParkingSlot> largeSlot = new HashMap<>();
    compactSlot.put("L1", new ParkingSlot("S4", ParkingSlotType.Large));
    compactSlot.put("L2", new ParkingSlot("S5", ParkingSlotType.Large));
    compactSlot.put("L3", new ParkingSlot("S6", ParkingSlotType.Large));
    allSlots.put(ParkingSlotType.Large, largeSlot);

    ParkingFloor parkingFloor = new ParkingFloor("F1", allSlots);
    List<ParkingFloor> parkingFloors = new ArrayList<>();
    parkingFloors.add(parkingFloor);

    //single instance of parking lot
    ParkingLot parkingLot = ParkingLot.getInstance(nameOfLot, address, parkingFloors);

    Vehicle vehicle = Vehicle.builder()
        .vehicleCategory(VehicleCategory.HatchBack)
        .vehicleNumber("KA-01-1234")
        .build();

    Ticket ticket = parkingLot.assignTicket(vehicle);
    System.out.println("Ticket is assigned with " + ticket.getTicketNumber());
    //persist the ticket in DB

    Thread.sleep(10000);  // this denotes the time till vehicle is parked
    //in actual sprint boot app, there would be separate end points for assign ticket and exit so no need there

    double price = parkingLot.exit(ticket);
    System.out.println("Price to be paid " + price);

  }

}
