package simplefactory;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 08/01/22
 */
public class FactoryMain {

  public static void main(String[] args) {
//    IngestionService ingestionService = new IngestionService();
//    ingestionService.ingestDataToMyDB("API");

    SourceFactory sourceFactory = new SourceFactory();
    IngestionService ingestionService = new IngestionService(sourceFactory);
    ingestionService.ingestDataToMyDB("API");
  }

}
