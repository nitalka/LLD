package tictactoe;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

import lombok.Getter;
import lombok.Setter;

/**
 * @author Alka Kumari
 * @version 02/01/22
 */

//REQUIREMENTS
//board should be n*n
//player profile should be required
//should be extensible for statistics collection, win %
//ranking of players can be done based on win %

@Getter
@Setter
public class Player {

  private String playerName;
  private String address;
  private int playerId;
  private char playerSymbol; //x or *
  private int ranking;

}

