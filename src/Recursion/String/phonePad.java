package Recursion.String;

import java.util.ArrayList;
import java.util.List;

public class phonePad {

  public static List<String> phonePad(String processed, String unprocessed) {

    ArrayList<String> list = new ArrayList<>();

    int digit = unprocessed.charAt(0) - '0';

    for (int i = (digit - 1) * 3; i < digit * 3; i++) {
      char ch = (char) ('a' + i);
      list.addAll(phonePad(processed + ch, unprocessed.substring(1)));
    }

    return list;
  }
}
