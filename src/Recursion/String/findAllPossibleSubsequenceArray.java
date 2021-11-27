package Recursion.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllPossibleSubsequenceArray {

  public static ArrayList<String> findAllPossibleSubsequenceArray(
      String unprocessed, String processed) {
    if (unprocessed.isEmpty()) {
      ArrayList<String> list = new ArrayList<String>();
      list.add(processed);
      return list;
    }
    ArrayList<String> possibleSubsequences = new ArrayList<>();
    char ch = unprocessed.charAt(0);

    possibleSubsequences.addAll(
        findAllPossibleSubsequenceArray(unprocessed.substring(1), processed + ch));
    possibleSubsequences.addAll(
        findAllPossibleSubsequenceArray(unprocessed.substring(1), processed));

    return possibleSubsequences;
  }

  /****{1,2,3}
   * [[]]
   * [[],[1]]
   * [[].[1],[2],[1,2]]
   * [[].[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
   */

  public static List<List<Integer>> findAllPossibleSubsequenceIterativeArray(int[] array) {
    List<List<Integer>> outer = new ArrayList<>();

    outer.add(new ArrayList<>());

    for (int num : array) {
      int size = outer.size();
      for (int i = 0; i < size; i++) {
        List<Integer> inner = new ArrayList<>(outer.get(i));
        inner.add(num);
        outer.add(inner);
      }
    }
    return outer;
  }

  /**** {1,2,2}
   * [[]]
   * [[],[1]]
   * [[].[1],[2],[1,2]] --> update the start index of copy to end+1 and end to length -1 to remove duplicates
   * [[].[1],[2],[1,2],[2],[1,2],[2,2],[1,2,2]]
   */

  public static List<List<Integer>> findAllPossibleSubsequenceIterativeArrayDuplicate(int[] array) {
    Arrays.sort(array);
    List<List<Integer>> outer = new ArrayList<>();

    outer.add(new ArrayList<>());
    int start = 0;
    int end = 0; //
    for (int j = 0; j < array.length; j++) {
      start = 0;
      // current element and previous element is same
      if (j > 0 && (array[j] == array[j - 1])) {
        start = end + 1;
      }
      int size = outer.size();
      end = size - 1;
      for (int i = start; i < size; i++) {
        List<Integer> inner = new ArrayList<>(outer.get(i));
        inner.add(array[j]);
        outer.add(inner);
      }
    }
    return outer;
  }
}
