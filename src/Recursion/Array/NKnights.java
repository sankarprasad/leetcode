package Recursion.Array;

public class NKnights {
  public static void main(String[] args) {
    boolean[][] board = new boolean[4][4];
    knight(board, 0, 0, 6);
  }

  private static void knight(boolean[][] board, int row, int col, int knights) {

    if (knights == 0) {
      display(board);
      System.out.println();
      return;
    }
    if (col == board.length && row == board.length - 1) {
      return;
    }

    if (col == board.length) {
      knight(board, row + 1, 0, knights);
      return;
    }

    if (isSafe(board, row, col)) {
      board[row][col] = true;
      knight(board, row, col + 1, knights - 1);
      board[row][col] = false;
    }
    knight(board, row, col + 1, knights);
  }

  private static boolean isSafe(boolean[][] board, int row, int col) {
    if (isValid(board, row, col)) {
      if (board[row][col]) {
        return false;
      }
    }
    if (isValid(board, row - 1, col - 2)) {
      if (board[row - 1][col - 2]) {
        return false;
      }
    }
    if (isValid(board, row - 1, col + 2)) {
      if (board[row - 1][col + 2]) {
        return false;
      }
    }
    if (isValid(board, row - 2, col - 1)) {
      if (board[row - 2][col - 1]) {
        return false;
      }
    }
    if (isValid(board, row - 2, col + 1)) {
      if (board[row - 2][col + 1]) {
        return false;
      }
    }
    return true;
  }

  private static boolean isValid(boolean[][] board, int row, int col) {
    if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
      return true;
    }
    return false;
  }

  private static void display(boolean[][] board) {
    for (boolean[] row : board) {
      for (boolean place : row) {
        System.out.print(place ? "K " : "e ");
      }
      System.out.println();
    }
  }
}
