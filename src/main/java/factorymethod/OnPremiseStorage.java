package factorymethod;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 09/01/22
 */
public class OnPremiseStorage implements IngestionService {

  @Override
  public IngestToDatabase getInstanceOfSource(String source) {
    if (source.equals("API")) {
      return new SourceDataFromAPI();
    } else if (source.equals("DataLake")) {
      return new SourceDataFromLake();
    } else if (source.equals("File")) {
      return new SourceDataFromFile();
    } else {
      return null;
    }
  }
}
