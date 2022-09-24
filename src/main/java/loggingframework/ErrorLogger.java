package loggingframework;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

import java.sql.SQLOutput;

/**
 * @author Alka Kumari
 * @version 19/04/22
 */
public class ErrorLogger extends AbstractLogger {

  protected ErrorLogger(int levels) {
    this.levels = levels;
  }

  @Override
  protected void display(String msg, LogSubject loggerSubject) {

    //System.out.println( "ERROR : " + msg);
    loggerSubject.notifyAllObserver(2, "ERROR : " + msg);
  }

}
