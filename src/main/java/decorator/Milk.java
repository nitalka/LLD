package decorator;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 05/01/22
 */
public class Milk extends IntegredientDecorator {

  Beverage beverage;

  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  String getBeverageName() {
    return beverage.getBeverageName() + " with milk ";
  }

  @Override
  int getPrice() {
    return beverage.getPrice() + 2;
  }
}
