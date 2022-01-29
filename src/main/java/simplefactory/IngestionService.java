package simplefactory;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 08/01/22
 */
public class IngestionService {

  private SourceFactory sourceFactory;

  public IngestionService(SourceFactory sourceFactory) {
    this.sourceFactory = sourceFactory;
  }


  public void ingestDataToMyDB(String source) {
    IngestToDatabase instanceOfSource = sourceFactory.getInstanceOfSource(source);
    instanceOfSource.ingestData();
  }

  /*
   we are breaking the rule of single responsibility,
   we are ingesting the data and defining the source as part of ingestion service ,
   so delegate this sourcing logic to Source factory
   */

//  public void ingestDataToMyDB(String source) {
//    IngestToDatabase ingestToDatabase = null;
//
//    if (source.equals("API")) {
//      ingestToDatabase = new SourceDataFromAPI();
//    } else if (source.equals("DataLake")) {
//      ingestToDatabase = new SourceDataFromLake();
//    } else if (source.equals("File")) {
//      ingestToDatabase = new SourceDataFromFile();
//    }
//
//    ingestToDatabase.ingestData();
//  }

}
