package Recursion.String;

public class findAllPermutationsCount {

  public static int findAllPermutationsCount(String unprocessed, String processed) {

    if (unprocessed.isEmpty()) {
      //   System.out.println(processed);
      return 1;
    }

    char ch = unprocessed.charAt(0);
    int count = 0;
    for (int i = 0; i <= processed.length(); i++) {
      String f = processed.substring(0, i);
      String s = processed.substring(i, processed.length());
      count += findAllPermutationsCount(unprocessed.substring(1), f + ch + s);
    }
    return count;
  }
}
