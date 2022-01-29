package adapter;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 10/01/22
 */
public class MediaPlayerMain {

  public static void main(String[] args) {
    MediaPlayer mediaPlayer = new MediaPlayerImpl();
    mediaPlayer.play("mysong", "mp3");
    mediaPlayer.play("mysong", "avi");
  }

}
