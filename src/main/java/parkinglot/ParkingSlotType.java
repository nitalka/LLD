package parkinglot;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 05/01/22
 */
public enum ParkingSlotType {
  TwoWheeler {
    public double getPriceForParking(long duration) {
      return duration * 0.05;
    }
  },
  Compact {
    public double getPriceForParking(long duration) {
      return duration * 0.075;
    }
  },
  Medium {
    public double getPriceForParking(long duration) {
      return duration * 0.09;
    }
  },
  Large {
    public double getPriceForParking(long duration) {
      return duration * 0.1;
    }
  };

  public abstract double getPriceForParking(long duration);
}
