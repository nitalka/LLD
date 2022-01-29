package parkinglot;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

import java.util.Map;

/**
 * @author Alka Kumari
 * @version 05/01/22
 */
public class ParkingFloor {

  private String name;
  private Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlots;

  //You should have used stack to keep track of empty slotsfor each packing slot type per floor
  // rather than iterating on all list of all parking slot type for a floor
  //and once its free pop it back to stack.Complexity will be O(1) which is O(N) in your implementation

  public ParkingFloor(String name,
      Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlots) {
    this.name = name;
    this.parkingSlots = parkingSlots;
  }
 // here synchronized can be added for application level locking , if single instance of parking lot
  //otherwise better to use double locking method at DB level only, where we check first whether slot is empty or not
  public ParkingSlot getRelevantParkingSlotForVehicle(Vehicle vehicle) {
    ParkingSlotType parkingSlotType = pickCorrectSlot(vehicle.getVehicleCategory());
    Map<String, ParkingSlot> relevantParkingSlot = parkingSlots.get(parkingSlotType);

    ParkingSlot parkingSlot = null;
    for (Map.Entry<String, ParkingSlot> m : relevantParkingSlot.entrySet()) {
      if (m.getValue().isAvailable()) {
        parkingSlot = m.getValue();
        parkingSlot.addVehicle(vehicle);
        break;
      }
    }
    return parkingSlot;
  }

  private ParkingSlotType pickCorrectSlot(VehicleCategory vehicleCategory) {

    if (vehicleCategory.equals(VehicleCategory.TwoWheeler)) {
      return ParkingSlotType.TwoWheeler;
    } else if (vehicleCategory.equals(VehicleCategory.HatchBack) || vehicleCategory
        .equals(VehicleCategory.Sedan)) {
      return ParkingSlotType.Compact;
    } else if (vehicleCategory.equals(VehicleCategory.SUV)) {
      return ParkingSlotType.Medium;
    } else if (vehicleCategory.equals(VehicleCategory.Bus)) {
      return ParkingSlotType.Large;
    }
    return null;
  }
}
