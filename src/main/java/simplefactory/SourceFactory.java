package simplefactory;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 08/01/22
 */
public class SourceFactory {

  public IngestToDatabase getInstanceOfSource(String source) {

    IngestToDatabase soureObject = null;
    if (source.equals("API")) {
      soureObject = new SourceDataFromAPI();
    } else if (source.equals("DataLake")) {
      soureObject = new SourceDataFromLake();
    } else if (source.equals("File")) {
      soureObject = new SourceDataFromFile();
    }
    return soureObject;
  }

}
