package adapter;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 10/01/22
 */
public class AVIPlayer implements AdvancedMediaPlayer {

  @Override
  public void playAdvancedMusic(AdvancedFormat advancedFormat) {
    System.out.println(
        "Playing advanced music " + advancedFormat.getFileToPlay() + " with format " + "."
            + advancedFormat.getFormat() + " in resolution " + advancedFormat.getResolution());
  }
}
