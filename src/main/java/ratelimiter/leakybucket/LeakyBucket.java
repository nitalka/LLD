package ratelimiter.leakybucket;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Alka Kumari
 * @version 28/02/22
 */
public class LeakyBucket implements RateLimiter {
  // Blocking queue because 1. if any request comes after bucket capacity filled, it will fail the request
  //2. Blocking Queue is thread safe so no need to do synchronisation
  BlockingQueue<Integer> queue;

  public LeakyBucket(int capacity) {
    this.queue = new LinkedBlockingQueue<>(capacity);
  }

  @Override
  public boolean grantAccess() {
    if(queue.remainingCapacity()>0) {
      queue.add(1); //if batch request comes, we can that no of req here instead of 1
      return true;
    }
    return false;
  }
}
