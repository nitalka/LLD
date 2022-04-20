package loggingframework;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 19/04/22
 */
public abstract class AbstractLogger {

  int levels;
  private AbstractLogger nextLevelLogger;

  void setNextLevelLogger(AbstractLogger nextLevelLogger) {
    this.nextLevelLogger = nextLevelLogger;
  }

  void logMessage(int levels, String msg, LogSubject loggerSubject) {
    if (this.levels == levels) { // in gereneral this.levels<= levels for error to print both info ,error
      display(msg, loggerSubject);
    }

    if (nextLevelLogger != null) {
      nextLevelLogger.logMessage(levels, msg, loggerSubject);
    }
  }

  protected abstract void display(String msg, LogSubject loggerSubject);

}
