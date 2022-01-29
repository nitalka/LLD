package facade;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 09/01/22
 */
public class HardWareChecks {

  MotherBoard motherBoard;
  RAM ram;

  public HardWareChecks() {
    this.motherBoard = new MotherBoard();
    this.ram = new RAM();
  }

  boolean checkAllHardware() {
    return motherBoard.checkMotherBoardOnBoot() && ram.checkRaAMOnBoot();
  }
}
