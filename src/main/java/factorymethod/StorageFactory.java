package factorymethod;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 08/01/22
 */
public class StorageFactory {

  public IngestionService getInstanceOfStorage(String source) {

    if (source.equals("cloud")) {
      return new OnCloudStorage();
    } else if (source.equals("DataLake")) {
      return new OnPremiseStorage();
    } else {
      return null;
    }
  }

}
