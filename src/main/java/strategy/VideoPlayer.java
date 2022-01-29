package strategy;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 11/01/22
 */
public abstract class VideoPlayer {

  Device currentDevice;
  Resolution currentResolution;

  abstract void display();

  void getDevice() {
    currentDevice.device();
  }

  void getResolution() {
    currentResolution.resolution();
  }

}
