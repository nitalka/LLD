package ratelimiter.leakybucket;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 28/02/22
 */
public interface RateLimiter {

  boolean grantAccess();  //to grant access to website or app

}
