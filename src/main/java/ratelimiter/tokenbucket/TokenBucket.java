package ratelimiter.tokenbucket;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Alka Kumari
 * @version 28/02/22
 */
public class TokenBucket implements RateLimiter {

  private int bucketCapacity;
  private int refreshRate;  //in sec
  private AtomicInteger currentCapacity; //parallel call , to make thread safe
  private AtomicLong lastUpdatedTime;

  public TokenBucket(int bucketCapacity, int refreshRate) {
    this.bucketCapacity = bucketCapacity;
    this.refreshRate = refreshRate;
    currentCapacity = new AtomicInteger(bucketCapacity);
    lastUpdatedTime = new AtomicLong(System.currentTimeMillis());
  }

  @Override
  public boolean grantAccess() {
    refreshBucket();
    if (currentCapacity.get() > 0) {
      currentCapacity.decrementAndGet();
      return true;
    }
    return false;
  }

  private void refreshBucket() {
    long currTime = System.currentTimeMillis();
    int additionalToken = (int) ((currTime - lastUpdatedTime.get()) / 1000 * refreshRate);
    int currCapacity = Math.min(currentCapacity.get() + additionalToken, bucketCapacity);
    currentCapacity.getAndSet(currCapacity);
    lastUpdatedTime.getAndSet(System.currentTimeMillis());
  }
}
