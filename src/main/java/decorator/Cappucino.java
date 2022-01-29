package decorator;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 05/01/22
 */
public class Cappucino extends Beverage {

  public Cappucino() {
    beverageName = "Cappucino";
  }

  @Override
  int getPrice() {
    return 7;
  }
}
