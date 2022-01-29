package bridge;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 04/01/22
 */
public abstract class Notification {

  NotificationSender notificationSender;

  public Notification(NotificationSender notificationSender) {
    this.notificationSender = notificationSender;
  }

  abstract void sendMessage();
}
