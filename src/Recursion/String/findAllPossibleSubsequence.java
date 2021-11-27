package Recursion.String;

public class findAllPossibleSubsequence {

  public static void findAllPossibleSubsequence(String unprocessed, String processed) {
    if (unprocessed.isEmpty()) {
      System.out.println(processed);
      return;
    }
    char ch = unprocessed.charAt(0);
    findAllPossibleSubsequence(unprocessed.substring(1), processed + ch);
    findAllPossibleSubsequence(unprocessed.substring(1), processed);
  }
}
