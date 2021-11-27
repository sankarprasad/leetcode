package String.easy;

// https://leetcode.com/problems/sorting-the-sentence/
public class sortSentence {
  public static void main(String[] args) {}

  public String sortSentence(String s) {
    String[] array = s.split(" ");
    String[] array2 = new String[array.length];
    StringBuilder stringBuilder = new StringBuilder();
    int i = 0;
    for (String item : array) {
      i = item.charAt(item.length() - 1) - '0';
      array2[i - 1] = item.substring(0, item.length() - 1);
    }

    for (int j = 0; j < array2.length; j++) {
      if (j == array2.length - 1) {
        stringBuilder.append(array2[j]);
      } else {
        stringBuilder.append(array2[j]).append(" ");
      }
    }
    return stringBuilder.toString();
  }
}
