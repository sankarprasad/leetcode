package Recursion.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class maze {
  public static void main(String[] args) {
    // int noOfWays = count(3, 3);
    // System.out.println(noOfWays);
    // System.out.println(printPath("S", 3, 3));
    boolean[][] maze = {
      {true, true, true},
      {true, true, true},
      {true, true, true},
    };
    int[][] matrix = new int[maze.length][maze[0].length];
    printMatrixPath(maze, "", 0, 0, matrix, 1);
  }

  public static int count(int r, int c) {

    if (r == 1 || c == 1) {
      return 1;
    }
    int left = count(r - 1, c);
    int right = count(r, c - 1);

    return left + right;
  }

  public static ArrayList<String> printPath(String path, int r, int c) {

    if (r == 1 && c == 1) {
      ArrayList<String> list = new ArrayList<>();
      list.add(path);
      System.out.println("---list is: " + list);
      System.out.println();
      return list;
    }

    ArrayList<String> list = new ArrayList<>();

    /** Diagonal */
    if (r > 1 && c > 1) {
      list.addAll(printPath(path + "-d", r - 1, c - 1));
    }

    if (r > 1) {
      list.addAll(printPath(path + "-D", r - 1, c));
    }

    if (c > 1) {
      list.addAll(printPath(path + "-R", r, c - 1));
    }

    return list;
  }

  public static void printAllPath(boolean[][] maze, String path, int r, int c) {
    if (r == maze.length - 1 && c == maze[0].length - 1) {
      System.out.println(path);
      return;
    }

    if (!maze[r][c]) {
      return;
    }

    maze[r][c] = false;
    /** Diagonal */
    if (r < maze.length - 1 && c < maze[0].length - 1) {
      printAllPath(maze, path + "-d", r + 1, c + 1);
    }

    if (r < maze.length - 1) {
      printAllPath(maze, path + "-D", r + 1, c);
    }

    if (c < maze[0].length - 1) {
      printAllPath(maze, path + "-R", r, c + 1);
    }

    if (r > 0) {
      printAllPath(maze, path + "-U", r - 1, c);
    }

    maze[r][c] = true;
  }

  public static void printMatrixPath(
      boolean[][] maze, String path, int r, int c, int[][] matrix, int step) {
    if (r == maze.length - 1 && c == maze[0].length - 1) {
      matrix[r][c] = step;
      for (int[] array : matrix) {
        System.out.println(Arrays.toString(array));
      }
      System.out.println("===========");
      return;
    }

    if (!maze[r][c]) {
      return;
    }

    maze[r][c] = false;
    System.out.println("----Visit " + r + " " + c);

    matrix[r][c] = step;
    /** Diagonal */
    if (r < maze.length - 1 && c < maze[0].length - 1) {
      printMatrixPath(maze, path + "-d", r + 1, c + 1, matrix, step + 1);
    }

    if (r < maze.length - 1) {
      printMatrixPath(maze, path + "-D", r + 1, c, matrix, step + 1);
    }

    if (c < maze[0].length - 1) {
      printMatrixPath(maze, path + "-R", r, c + 1, matrix, step + 1);
    }

    if (r > 0) {
      printMatrixPath(maze, path + "-U", r - 1, c, matrix, step + 1);
    }

    System.out.println("----Revert " + r + " " + c);
    maze[r][c] = true;
    matrix[r][c] = 0;
  }
}
