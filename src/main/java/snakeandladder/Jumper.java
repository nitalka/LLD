package snakeandladder;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

import lombok.Getter;
import lombok.Setter;

/**
 * @author Alka Kumari
 * @version 29/12/21
 */
@Getter
@Setter
public class Jumper {

  private int startPoint;
  private int endPoint;

  //this class can be broken down to two separate for ladder and snakes
  //extra validation can be added if start point is lesser than end point for ladder or not and vice versa for snakes,
  //so that when game loads exception can be thrown if not satisfied
  //based on ladder or not, boolean can be set

  public Jumper(int startPoint, int endPoint) {
    this.startPoint = startPoint;
    this.endPoint = endPoint;
  }
}
