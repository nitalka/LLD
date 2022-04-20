package loggingframework;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 19/04/22
 */
public class Application {

  public static void main(String[] args) {
    Logger logger = Logger.getLogger();
    logger.info("this is an info");
   // logger.debug("this is a debug");
   // logger.error("this is an error");
  }

}
