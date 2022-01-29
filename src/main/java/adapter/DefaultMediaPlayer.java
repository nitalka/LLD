package adapter;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 10/01/22
 */
public class DefaultMediaPlayer implements MediaPlayer {

  @Override
  public void play(String fileToPlay, String format) {
    System.out.println("Playing default format " + fileToPlay + "." + format);
  }
}
