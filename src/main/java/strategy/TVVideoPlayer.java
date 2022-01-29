package strategy;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 11/01/22
 */
public class TVVideoPlayer extends VideoPlayer {


  public TVVideoPlayer(Device device, Resolution resolution) {
    this.currentDevice = device;
    this.currentResolution = resolution;
  }

  @Override
  void display() {
    getDevice();
    getResolution();

  }
}
