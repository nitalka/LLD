package simplefactory;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 08/01/22
 */
public class SourceDataFromLake implements IngestToDatabase {

  @Override
  public void ingestData() {
    System.out.println("ingesting data from Data Lake...");
  }
}
