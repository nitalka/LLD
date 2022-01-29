package facade;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 09/01/22
 */
public class SoftwareChecks {

  Driver driver;
  OS os;

  public SoftwareChecks() {
    this.driver = new Driver();
    this.os = new OS();
  }

  boolean checkAllSoftware() {
    return driver.checkDriverOnBoot() && os.checkOSOnBoot();
  }
}
