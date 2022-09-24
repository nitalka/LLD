package loggingframework;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 19/04/22
 */
public class FileLogger implements LogObserver {

  @Override
  public void log(String message) {
    System.out.println("FILE MESSAGE : "+ message);
  }

}
