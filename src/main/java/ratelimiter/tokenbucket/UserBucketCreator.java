package ratelimiter.tokenbucket;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alka Kumari
 * @version 28/02/22
 */
public class UserBucketCreator {

  Map<Integer, TokenBucket> bucket; //map of each user with its bucket

  public UserBucketCreator(int id) {
    this.bucket = new HashMap<>();
    this.bucket.put(id, new TokenBucket(10, 10)); //we can configure this capacity of bucket.
  }

  public void accessApplication(int id) {

    if (bucket.get(id).grantAccess()) {
      System.out.println(Thread.currentThread().getName() + "  -> access is granted...");
    } else {
      System.out.println(Thread.currentThread().getName() + " -> too many requests....");
    }
  }

}
