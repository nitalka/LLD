package snakeandladder;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * @author Alka Kumari
 * @version 29/12/21
 */
public class GameBoard {

  private Dice dice;
  private List<Jumper> snakes;
  private List<Jumper> ladders;
  private Map<String, Integer> playersCurrentPos;
  private int boardSize;
  private Queue<Player> nextTurn;

  public GameBoard(Dice dice, List<Jumper> snakes, List<Jumper> ladders,
      Map<String, Integer> playersCurrentPos, int boardSize,
      Queue<Player> nextTurn) {
    this.dice = dice;
    this.snakes = snakes;
    this.ladders = ladders;
    this.playersCurrentPos = playersCurrentPos;
    this.boardSize = boardSize;
    this.nextTurn = nextTurn;
  }
  //these can be injected through property files also


  void startGame() {
    //game runs till there are 2 or more player in game
    while (nextTurn.size() > 1) {

      Player currentPlayer = nextTurn.poll();
      int currentPosition = playersCurrentPos.get(currentPlayer.getPlayerName());
      int diceValue = dice.rollDice();
      int nextPosition = currentPosition + diceValue;

      if (nextPosition > boardSize) {
        nextTurn.offer(currentPlayer);
      } else if (nextPosition == boardSize) {
        System.out.println(currentPlayer.getPlayerName() + " won the game ");
      } else {
        int[] nextPos = new int[1];
        boolean[] isLadder = new boolean[1];
        nextPos[0] = nextPosition;

        snakes.forEach(snake -> {
          if (snake.getStartPoint() == nextPosition) {
            nextPos[0] = snake.getEndPoint();
          }
        });

        if (nextPos[0] != nextPosition) {
          System.out.println(currentPlayer.getPlayerName() + " bitten by snake at " + nextPosition);
        }

        ladders.forEach(ladder -> {
          if (ladder.getStartPoint() == nextPosition) {
            nextPos[0] = ladder.getEndPoint();
            isLadder[0] = true;
          }
        });

        if (nextPos[0] != nextPosition && isLadder[0]) {
          System.out
              .println(currentPlayer.getPlayerName() + " jumps through ladder at " + nextPosition);
        }

        if (nextPos[0] == boardSize) {
          System.out.println(currentPlayer.getPlayerName() + " won the game ");
        } else {
          playersCurrentPos.put(currentPlayer.getPlayerName(), nextPos[0]);
          System.out.println(currentPlayer.getPlayerName() + " is now at " + nextPos[0]);
          nextTurn.offer(currentPlayer);
        }
      }

    }
  }
}

//code may be optimized, instead of creating the list of snake, ladder, and jumper,
// we can create a map for where the key is start point and value is endpoint,
// this way we can save time to search if target position is  ladder/ snake or not int o(1) time,


//giving equal probability to all numbers for more than 1 die, but actually,
// probability of 5 (4+1, 2+3, 3+2, 1+4) is different than say 2 (1+1)