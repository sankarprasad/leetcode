package Recursion.Array;

public class NQueens {
  public static void main(String[] args) {
    boolean[][] board = new boolean[4][4];
    System.out.println("No Of Ways Queens can be placed: " + queen(board, 0));
  }

  private static int queen(boolean[][] board, int row) {

    if (row == board.length) {
      display(board);
      System.out.println();
      return 1;
    }
    int count = 0;
    for (int col = 0; col < board.length; col++) {
      if (isSafe(board, row, col)) {
        board[row][col] = true;
        count += queen(board, row + 1);
        board[row][col] = false;
      }
    }

    return count;
  }

  private static void display(boolean[][] board) {
    for (boolean[] row : board) {
      for (boolean place : row) {
        System.out.print(place ? "Q " : "e ");
      }
      System.out.println();
    }
  }

  private static boolean isSafe(boolean[][] board, int row, int col) {
    // check vertical row
    for (int i = 0; i < row; i++) {
      if (board[i][col]) {
        return false;
      }
    }

    // left diagonal
    int maxLeft = Math.min(row, col);
    for (int i = 0; i <= maxLeft; i++) {
      if (board[row - i][col - i]) {
        return false;
      }
    }

    // right diagonal
    int maxRight = Math.min(row, board.length - col - 1);
    for (int i = 0; i <= maxRight; i++) {
      if (board[row - i][col + i]) {
        return false;
      }
    }
    return true;
  }
}
