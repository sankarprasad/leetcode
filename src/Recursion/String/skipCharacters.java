package Recursion.String;

public class skipCharacters {

  public static String skipCharacters(String unprocessed, char letterToBeSkipped) {

    if (unprocessed.isEmpty()) return "";

    char letter = unprocessed.charAt(0);

    if (letter == letterToBeSkipped) {
      return skipCharacters(unprocessed.substring(1), letterToBeSkipped);
    }
    return letter + skipCharacters(unprocessed.substring(1), letterToBeSkipped);
  }
}
