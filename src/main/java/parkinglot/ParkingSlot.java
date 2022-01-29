package parkinglot;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

import lombok.Builder.Default;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alka Kumari
 * @version 05/01/22
 */
@Getter
@Setter
public class ParkingSlot {

  private String name;
  @Default
  private boolean isAvailable = true;
  private Vehicle vehicle;
  ParkingSlotType parkingSlotType;

  public ParkingSlot(String name, ParkingSlotType parkingSlotType) {
    this.name = name;
    this.parkingSlotType = parkingSlotType;
  }

  public void addVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
    this.isAvailable = false;
  }

  public void removeVehicle() {
    this.vehicle = null;
    this.isAvailable = true;
  }
}
