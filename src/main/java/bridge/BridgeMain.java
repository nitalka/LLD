package bridge;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 04/01/22
 */
public class BridgeMain {

  public static void main(String[] args) {
    TextNotification textNotification = new TextNotification(new Whatsapp());
    textNotification.sendMessage();
  }

}
