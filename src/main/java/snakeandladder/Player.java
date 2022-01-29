/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */
package snakeandladder;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Alka Kumari
 * @version 29/12/21
 */

@Getter
@Setter
public class Player {
  private String playerName;
  private int id;

  public Player(String playerName, int id) {
    this.playerName = playerName;
    this.id = id;
  }
}
