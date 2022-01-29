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
@Getter
@Setter
@Builder
public class Vehicle {

  private String vehicleNumber;
  private VehicleCategory vehicleCategory;

}
