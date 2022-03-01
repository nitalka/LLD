package ratelimiter.leakybucket;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alka Kumari
 * @version 28/02/22
 */
//in case of distributed system, say having 3 servers, each user can have 30 requests
// as each server will have individual leaky bucket.
//to solve this, we can create a global instance of cache which stores this bucket,
// so instead of putting this in local cache we can have distributed cache (redis) connection and add the bucket there.
public class UserBucketCreator {

  Map<Integer, LeakyBucket> bucket; //map of each user with its bucket

  public UserBucketCreator(int id) {
    this.bucket = new HashMap<>();
    this.bucket.put(id, new LeakyBucket(10)); //we can configure this capacity of bucket.
  }

  public void accessApplication(int id) {

    if(bucket.get(id).grantAccess()) {
      System.out.println(Thread.currentThread().getName()+ "  -> access is granted...");
    } else {
      System.out.println(Thread.currentThread().getName()+ " -> too many requests....");
    }
  }
}
