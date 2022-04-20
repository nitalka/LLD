package loggingframework;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 19/04/22
 */
public class LogManager {

  static AbstractLogger doChaining() {
    AbstractLogger infoLogger = new InfoLogger(1);

    AbstractLogger errorLogger = new ErrorLogger(2);
    infoLogger.setNextLevelLogger(errorLogger);

    AbstractLogger debugLogger = new DebugLogger(3);
    errorLogger.setNextLevelLogger(debugLogger);

    return infoLogger;
  }

  static LogSubject addObservers() {
    LogSubject loggerSubject = new LogSubject();

    ConsoleLogger consoleLogger = new ConsoleLogger();
    FileLogger fileLogger = new FileLogger();

    loggerSubject.addObserver(1, consoleLogger);
    loggerSubject.addObserver(2, consoleLogger);
    loggerSubject.addObserver(3, consoleLogger);

    loggerSubject.addObserver(1, fileLogger);
    loggerSubject.addObserver(2, fileLogger);
    return loggerSubject;
  }

}
