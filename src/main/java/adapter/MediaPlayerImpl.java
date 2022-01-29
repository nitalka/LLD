package adapter;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 10/01/22
 */
public class MediaPlayerImpl implements MediaPlayer {

  @Override
  public void play(String fileToPlay, String format) {
    if (format.equals("mp3")) {
      MediaPlayer mediaPlayer = new DefaultMediaPlayer();
      mediaPlayer.play(fileToPlay, format);
    } else {
      AdvancedFormat advancedFormat = new AdvancedFormat();
      advancedFormat.setResolution("720");
      MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter(advancedFormat);
      mediaPlayerAdapter.play(fileToPlay, format);
    }
  }
}
