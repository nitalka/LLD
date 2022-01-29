package tictactoe;/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Alka Kumari
 * @version 02/01/22
 */
public class GameBoard {

  private int boardSize;
  private char[][] board;
  private Queue<Player> nextTurn;

  public GameBoard(int boardSize, Player[] players) {
    this.boardSize = boardSize;
    this.board = new char[(2 * boardSize) - 1][(2 * boardSize) - 1];
    initializeBoard(board);
    nextTurn = new LinkedList<>();
    nextTurn.offer(players[0]);
    nextTurn.offer(players[1]);
  }


  /*
board will look like
      | |
     -+-+-
      | |
     -+-+-
      | |
*/
  private void initializeBoard(char[][] board) {

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (i % 2 == 0 && j % 2 != 0) {
          board[i][j] = '|';
        }
        if (i % 2 != 0 && j % 2 == 0) {
          board[i][j] = '-';
        }
        if (i % 2 != 0 && j % 2 != 0) {
          board[i][j] = '+';
        }
      }
    }
  }

  public void printBoard() {

    for (char[] row : board) {
      for (char col : row) {
        System.out.print(col);
      }
      System.out.println();
    }
  }

  public void startGame() {
    int count = 0;
    while (true) {
      count++;
      //for 3 sixe max 9 moves can be played
      if (count == boardSize * boardSize + 1) {
        System.out.println("Match Drawn");
        break;
      }

      Player p = nextTurn.poll();
      int position = getUserInput(p);
      int row =
          2 * ((position % boardSize == 0) ? (position / boardSize) - 1 : position / boardSize);
      int col = 2 * ((position % boardSize == 0 ? boardSize : position % boardSize) - 1);
      board[row][col] = p.getPlayerSymbol();
      System.out.println("printing board after a move");
      printBoard();

      //taking 2 player game so multiply with 2
      if (count >= 2 * boardSize && checkEndGame(p, row, col)) {
        break;
      }
      nextTurn.offer(p);

    }
  }

  private int getUserInput(Player player) {
    System.out.println("current status of board");
    printBoard();
    System.out.println(player.getPlayerName() + " Please enter a valid number between 1 - " + (
        boardSize * boardSize));
    Scanner sc = new Scanner(System.in);
    int val = sc.nextInt();
    while (!validateInput(val)) {
      printBoard();
      System.out.println("wrong position " +
          player.getPlayerName() + " Please enter a valid number between 1 - " + (
          boardSize * boardSize));
      val = sc.nextInt();
    }
    return val;
  }

  // can return from 1 to n*n, better approach would be to take two values
  // i.e row, and col as input from frontend system instead of us calculating them
  //for backend taking one i/p is easy

  private boolean validateInput(int val) {
    if (val < 0 || val > boardSize * boardSize) {
      return false;
    }
    int row = 2 * ((val % boardSize == 0) ? (val / boardSize) - 1 : val / boardSize);
    int col = 2 * ((val % boardSize == 0 ? boardSize : val % boardSize) - 1);
    if ((int) board[row][col] != 0) {
      return false;
    }
    return true;

  }

  private boolean checkEndGame(Player player, int row, int col) {
    String winString = "";
    for (int i = 0; i < boardSize; i++) {
      winString += String.valueOf(player.getPlayerSymbol());
    }

    String rowString = "";
    String columnString = "";
    String diagonalString = "";
    String reverseDiagonalString = "";

    for (int i = 0; i < board.length; i = i + 2) {
      rowString += board[row][i];
      columnString += board[i][col];

      if (row == col) {
        diagonalString += board[i][i];
      }

      if (row + col == board.length - 1) {
        reverseDiagonalString += board[board.length - 1 - i][i];
      }
    }

    if (winString.equals(rowString) || winString.equals(columnString) || winString
        .equals(diagonalString) ||
        winString.equals(reverseDiagonalString)) {
      System.out.println(player.getPlayerName() + " has won the game ");
      return true;
    }
    return false;
  }

}


