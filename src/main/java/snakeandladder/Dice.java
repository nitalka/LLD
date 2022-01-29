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
public class Dice {

  private int noOfDice;

  public Dice(int noOfDice) {
    this.noOfDice = noOfDice;
  }

  int rollDice() {
    return (int) (Math.random() * (6 * noOfDice - 1 * noOfDice)) + 1;
    //for no of dice = 1, upper bound = 6, lower bound = 1;
    //for no of dice = 2, upper bound = 12, lower bound = 2;
  }
}
