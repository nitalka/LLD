package bridge;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 04/01/22
 */
public class TextNotification extends Notification{

  public TextNotification(NotificationSender notificationSender) {
    super(notificationSender);
    System.out.println("this is a text message");
  }

  @Override
  void sendMessage() {
    notificationSender.sendNotification();

  }
}
