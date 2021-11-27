package Recursion.Array;

import java.util.ArrayList;
import java.util.List;

public class dice {

  /***
   *
   * {1,2,3,4,5,6} , target 4
   * [1]/[3], [2]/[2], [3]/[1], [4]/[]
   * [([1,1]/[2]),([1,2]/[1]),([1,3]/[])],[...],[...],[...]
   */

  public static List<String> dice(String processed, int target) {
    if (target == 0) {
      ArrayList<String> list = new ArrayList<>();
      list.add(processed);
      return list;
    }

    ArrayList<String> list = new ArrayList<>();

    for (int i = 1; (i <= 6 && i <= target); i++) {
      list.addAll(dice(processed + i, target - i));
    }

    return list;
  }
}
