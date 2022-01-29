package parkinglot;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alka Kumari
 * @version 05/01/22
 */
@Builder
@Getter
@Setter
public class Ticket {

  private String ticketNumber;
  private long startTime;
  private long endTime;
  private Vehicle vehicle;
  private ParkingSlot parkingSlot;

  public static Ticket createTicket(Vehicle vehicle, ParkingSlot parkingSlot) {
    return Ticket.builder()
        .startTime(System.currentTimeMillis())
        .parkingSlot(parkingSlot)
        .ticketNumber(vehicle.getVehicleNumber() + System.currentTimeMillis())
        .vehicle(vehicle)
        .build();
  }

}
