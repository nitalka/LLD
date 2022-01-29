package factorymethod;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 08/01/22
 */
public interface IngestionService {


  default void ingestDataToMyDB(String source) {
    IngestToDatabase instanceOfSource = getInstanceOfSource(source);
    instanceOfSource.ingestData();
  }

  IngestToDatabase getInstanceOfSource(String source);

}
