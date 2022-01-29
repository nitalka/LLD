package facade;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 09/01/22
 */
public class Laptop {

  HardWareChecks hardWareChecks;
  SoftwareChecks softwareChecks;

  public Laptop() {
    this.hardWareChecks = new HardWareChecks();
    this.softwareChecks = new SoftwareChecks();
  }

  void checkLaptopOnBoot() {
    if (hardWareChecks.checkAllHardware() && softwareChecks.checkAllSoftware()) {
      System.out.println("Switching on Laptop...");
    } else {
      System.out.println("Something went wrong...");
    }

  }
}
