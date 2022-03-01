package ratelimiter.leakybucket;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Alka Kumari
 * @version 28/02/22
 */
public class Application {

  public static void main(String[] args) {
    UserBucketCreator userBucketCreator = new UserBucketCreator(1);
    /**
    for(int i =0; i<12;i++) {
      userBucketCreator.accessApplication(1);
    } **/

    //in real world there will be consumer to consume the messages not implemented here.

    //to parallelise the application, use executor service
    //12 threads parallelly running in an application
    ExecutorService executorService = Executors.newFixedThreadPool(12);
    for(int i =0; i<12;i++) {
     executorService.execute(() -> userBucketCreator.accessApplication(1));
    }

    executorService.shutdown();


  }

}
