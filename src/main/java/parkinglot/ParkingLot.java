package parkinglot;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

import java.util.List;
import java.util.Map;

/**
 * @author Alka Kumari
 * @version 05/01/22
 */
public class ParkingLot {

  private String nameOfParkingLot;
  private Address address;
  private List<ParkingFloor> parkingFloorList;
  private static ParkingLot parkingLot = null;

  private ParkingLot(String nameOfParkingLot, Address address,
      List<ParkingFloor> parkingFloorList) {
    this.nameOfParkingLot = nameOfParkingLot;
    this.address = address;
    this.parkingFloorList = parkingFloorList;
  }

  //make parking lot singleton, otherwise every floors parking slots will be replicated
  public static ParkingLot getInstance(String nameOfParkingLot, Address address,
      List<ParkingFloor> parkingFloors) {
    if (parkingLot == null) {
      parkingLot = new ParkingLot(nameOfParkingLot, address, parkingFloors);
    }
    return parkingLot;
  }

  public void addFloor(String name, Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlots) {
    ParkingFloor parkingFloor = new ParkingFloor(name, parkingSlots);
    parkingFloorList.add(parkingFloor);
  }

  public void removeFloor(ParkingFloor parkingFloor) {
    this.parkingFloorList.remove(parkingFloor);
  }

  public Ticket assignTicket(Vehicle vehicle) {
    //to assign ticket, get parking slot for this vehicle
    ParkingSlot parkingSlot = getParkingSlot(vehicle);
    if (parkingSlot == null) {
      return null;
    }
    Ticket ticket = createTicket(parkingSlot, vehicle);
    //can be persisited in DB
    return ticket;
  }
  private ParkingSlot getParkingSlot(Vehicle vehicle) {
    ParkingSlot parkingSlot = null;
    for (ParkingFloor parkingFloor : parkingFloorList) {
      parkingSlot = parkingFloor.getRelevantParkingSlotForVehicle(vehicle);
      if (parkingSlot != null) {
        break;
      }
    }
    return parkingSlot;
  }

  private Ticket createTicket(ParkingSlot parkingSlot, Vehicle vehicle) {
    return Ticket.createTicket(vehicle, parkingSlot);
  }

  public double exit(Ticket ticket) {
    long endTime = System.currentTimeMillis();
    ticket.getParkingSlot().removeVehicle();
    long duration = (endTime - ticket.getStartTime()) / 1000;
    double priceForParking = ticket.getParkingSlot().getParkingSlotType()
        .getPriceForParking(duration);
    //persist in DB
    return priceForParking;
  }


}
