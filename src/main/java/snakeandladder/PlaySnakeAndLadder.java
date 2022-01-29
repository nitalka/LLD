package snakeandladder;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * @author Alka Kumari
 * @version 29/12/21
 */
public class PlaySnakeAndLadder {
  public static void main(String[] args) {
    Dice dice = new Dice(1);

    Player player1 = new Player("alka", 1);
    Player player2 = new Player("pooja", 2);
    Queue<Player> allPlayers = new LinkedList<>();
    allPlayers.offer(player1);
    allPlayers.offer(player2);

    Jumper snake1 = new Jumper(10, 2);
    Jumper snake2 = new Jumper(99, 12);
    List<Jumper> snakes = new ArrayList<>();
    snakes.add(snake1);
    snakes.add(snake2);

    Jumper ladder1 = new Jumper(5, 25);
    Jumper ladder2 = new Jumper(40, 89);
    List<Jumper> ladders = new ArrayList<>();
    ladders.add(ladder1);
    ladders.add(ladder2);

    Map<String, Integer> playersCurrentPos = new HashMap<>();
    playersCurrentPos.put("alka", 0);
    playersCurrentPos.put("pooja", 0);

    GameBoard gb = new GameBoard(dice,snakes,ladders,playersCurrentPos,100,allPlayers);
    gb.startGame();;
  }

}
