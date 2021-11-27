package Patterns;

public class patterns {
  public static void main(String[] args) {
    // pattern1(5);
    // pattern2(5);
    // pattern3(5);
    // pattern4(5);
    // pattern5(5);
    // pattern6(5);
    // pattern7(5);
    // pattern8(5);
    // pattern9(5);
    // pattern10(5);
    // pattern11(5);
    // pattern12(5);
    // pattern31(4);
    // pattern22(5);
    // pattern23(3);
  }

  private static void pattern1(int n) {
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < n; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // pattern2
  // *
  // **
  // ***
  // ****
  // *****
  private static void pattern2(int n) {
    for (int row = 0; row < n; row++) {
      for (int col = 0; col <= row; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // *****
  // ****
  // ***
  // **
  // *
  private static void pattern3(int n) {
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < n - row; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  //     1
  //     1 2
  //     1 2 3
  //     1 2 3 4
  //     1 2 3 4 5

  private static void pattern4(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }
  // *
  // **
  // ***
  // ****
  // *****
  // ****
  // ***
  // **
  // *

  private static void pattern5(int n) {
    for (int row = 1; row <= 2 * n - 1; row++) {
      int noOfColumns = row > n ? (2 * n - row) : row;
      for (int col = 1; col <= noOfColumns; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  //      *
  //     **
  //    ***
  //   ****
  //  *****

  private static void pattern6(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n - row; col++) {
        System.out.print("  ");
      }
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  // *****
  //  ****
  //   ***
  //    **
  //     *

  private static void pattern7(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= row - 1; col++) {
        System.out.print(" ");
      }
      for (int col = 1; col <= n + 1 - row; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  //    *
  //   ***
  //  *****
  // *******
  // **********

  private static void pattern8(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n - row; col++) {
        System.out.print(" ");
      }
      for (int col = 1; col <= row; col++) {
        System.out.print("*");
      }
      for (int col = 1; col <= row - 1; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  //  **********
  //   *******
  //    *****
  //     ***
  //      *

  private static void pattern9(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= row - 1; col++) {
        System.out.print(" ");
      }
      for (int col = 1; col <= n + 1 - row; col++) {
        System.out.print("*");
      }
      for (int col = 1; col <= n - row; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  //      *
  //     * *
  //    * * *
  //   * * * *
  //  * * * * *
  private static void pattern10(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n - row; col++) {
        System.out.print(" ");
      }
      for (int col = 1; col <= row; col++) {
        if (col % 2 == 0) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      for (int col = 2; col <= row; col++) {
        if (row % 2 != 0) {
          if (col % 2 == 0) {
            System.out.print(" ");
          } else {
            System.out.print("*");
          }
        } else {
          if (col % 2 == 0) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }

  private static void pattern11(int n) {
    for (int row = 0; row <= n; row++) {
      for (int col = 0; col <= row; col++) {
        System.out.print(" ");
      }

      for (int col = 1; col <= n - row; col++) {
        if (col % 2 == 0) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }

      for (int col = 1; col <= n - row; col++) {
        if (row % 2 != 0) {
          if (col % 2 == 0) {
            System.out.print(" ");
          } else {
            System.out.print("*");
          }
        } else {
          if (col % 2 == 0) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }

  private static void pattern12(int n) {
    for (int row = 0; row <= n; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print(" ");
      }

      for (int col = 1; col <= n - row; col++) {
        if (col % 2 == 0) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }

      for (int col = 1; col <= n - row; col++) {
        if (row % 2 != 0) {
          if (col % 2 == 0) {
            System.out.print(" ");
          } else {
            System.out.print("*");
          }
        } else {
          if (col % 2 == 0) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
      }
      if (row != n - 1) {
        System.out.println();
      }
    }
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n - row; col++) {
        System.out.print(" ");
      }
      for (int col = 1; col <= row; col++) {
        if (col % 2 == 0) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      for (int col = 2; col <= row; col++) {
        if (row % 2 != 0) {
          if (col % 2 == 0) {
            System.out.print(" ");
          } else {
            System.out.print("*");
          }
        } else {
          if (col % 2 == 0) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }

  private static void pattern31(int n) {
    for (int row = 0; row < 2 * n - 1; row++) {
      for (int col = 0; col < 2 * n - 1; col++) {
        int left = col;
        int top = row;
        int right = 2 * n - 2 - col;
        int bottom = 2 * n - 2 - row;
        int val = n - Math.min(Math.min(left, right), Math.min(top, bottom));
        System.out.print(val + " ");
      }
      System.out.println();
    }
  }

  private static void pattern22(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= row; col++) {
        if ((row + col) % 2 == 0) {
          System.out.print(1 + " ");
        } else {
          System.out.print(0 + " ");
        }
      }
      System.out.println();
    }
  }

  private static void pattern23(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col < n - row - 1; col++) {
        System.out.print("  ");
      }

      for (int col = 1; col <= n; col++) {
        if (row + col - 1 == n) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      for (int col = 2; col <= n; col++) {
        if (row == col) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      for (int col = 2; col < n - row - 1; col++) {
        System.out.print("  ");
      }

      for (int col = 2; col <= n; col++) {
        if (row + col - 1 == n) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      for (int col = 2; col <= n; col++) {
        if (row == col) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }

      System.out.println();
    }
  }
}
