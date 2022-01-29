package factorymethod;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 08/01/22
 */
public class FactoryMain {

  public static void main(String[] args) {

//    IngestionService onPremiseStorage= new OnPremiseStorage();
//    onPremiseStorage.ingestDataToMyDB("API");
//
//    IngestionService onCloudStorage= new OnCloudStorage();
//    onCloudStorage.ingestDataToMyDB("API");

    //after abstract factory pattern...

    StorageFactory storageFactory = new StorageFactory();
    IngestionService storage = storageFactory.getInstanceOfStorage("cloud");
    storage.ingestDataToMyDB("API");

  }


  /*
                    Ingestion Service

                    .                .
                   .                    .
                  .                         .
                 .                              .
                 OnpremiseStorage           CloudStorage
                  .                                 .
                .                                 .
              .                                 .
            .                                 .
          File       API     DataLake        File     API





   */

}
