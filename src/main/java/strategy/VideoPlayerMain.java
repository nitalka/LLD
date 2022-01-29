package strategy;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 11/01/22
 */
public class VideoPlayerMain {

  public static void main(String[] args) {
    Device device = new TV();
    Resolution resolution = new Resol1080p();
    VideoPlayer videoPlayer = new TVVideoPlayer(device, resolution);
    videoPlayer.display();
  }

}
