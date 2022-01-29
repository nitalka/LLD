package adapter;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 10/01/22
 */
public class AdvancedFormat {
  private String fileToPlay;
  private String format;
  private String resolution;

  public String getFileToPlay() {
    return fileToPlay;
  }

  public void setFileToPlay(String fileToPlay) {
    this.fileToPlay = fileToPlay;
  }

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public String getResolution() {
    return resolution;
  }

  public void setResolution(String resolution) {
    this.resolution = resolution;
  }
}
