package Recursion.String;

public class skipApples {

  public static String skipApples(String unprocessed, String stringToBeSkipped) {
    if (unprocessed.isEmpty()) return "";

    char letter = unprocessed.charAt(0);

    if (unprocessed.startsWith(stringToBeSkipped)) {
      return skipApples(unprocessed.substring(stringToBeSkipped.length()), stringToBeSkipped);
    }
    return letter + skipApples(unprocessed.substring(1), stringToBeSkipped);
  }
}
