package loggingframework;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 19/04/22
 */
public class DebugLogger extends AbstractLogger {

  protected DebugLogger(int levels) {
    this.levels = levels;
  }

  @Override
  protected void display(String msg, LogSubject loggerSubject) {

    //System.out.println( "DEBUG : " + msg);
    loggerSubject.notifyAllObserver(3, "DEBUG : " + msg);
  }

}
