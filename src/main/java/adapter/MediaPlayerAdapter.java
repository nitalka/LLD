package adapter;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 10/01/22
 */
public class MediaPlayerAdapter implements MediaPlayer {

  AdvancedMediaPlayer advancedMediaPlayer;
  AdvancedFormat advancedFormat;

  public MediaPlayerAdapter(AdvancedFormat advancedFormat) {
    advancedMediaPlayer = new AVIPlayer();
    this.advancedFormat = advancedFormat;
  }

  @Override
  public void play(String fileToPlay, String format) {
    advancedFormat.setFileToPlay(fileToPlay);
    advancedFormat.setFormat(format);
    advancedMediaPlayer.playAdvancedMusic(advancedFormat);

  }
}
