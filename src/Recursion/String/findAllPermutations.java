package Recursion.String;

import java.util.ArrayList;
import java.util.List;

public class findAllPermutations {

  /***
   * ""/"abc"
   * "a"/"bc"
   * ["ba"/"c", "ab"/"c"]
   * ["bac"/"","cab"/"","bca/""", ..........]
   *
   * * */
  public static List<String> findAllPermutations(String unprocessed, String processed) {

    if (unprocessed.isEmpty()) {
      List<String> list = new ArrayList<>();
      list.add(processed);
      return list;
    }

    ArrayList<String> list = new ArrayList<>();
    char ch = unprocessed.charAt(0);

    for (int i = 0; i <= processed.length(); i++) {
      String f = processed.substring(0, i);
      String s = processed.substring(i, processed.length());
      list.addAll(findAllPermutations(unprocessed.substring(1), f + ch + s));
    }
    return list;
  }
}
