package tictactoe;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

/**
 * @author Alka Kumari
 * @version 02/01/22
 */
public class PlayGame {

  public static void main(String[] args) {
    Player p1 = new Player();
    p1.setPlayerId(1);
    p1.setPlayerName("alka");
    p1.setPlayerSymbol('x');

    Player p2 = new Player();
    p2.setPlayerId(2);
    p2.setPlayerName("pooja");
    p2.setPlayerSymbol('o');

    Player[] players = new Player[]{p1, p2};

    GameBoard gb = new GameBoard(3, players);
    gb.startGame();
  }

}
