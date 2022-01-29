package factorymethod;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 09/01/22
 */
public class CloudSourceDataFromFile implements IngestToDatabase {

  @Override
  public void ingestData() {
    System.out.println("CLOUD : ingesting data from File...");
  }
}
