package factorymethod;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 09/01/22
 */
public class OnCloudStorage implements IngestionService {

  @Override
  public IngestToDatabase getInstanceOfSource(String source) {
    if (source.equals("API")) {
      return new CloudSourceDataFromAPI();
    } else if (source.equals("File")) {
      return new CloudSourceDataFromFile();
    } else {
      return null;
    }
  }
}
