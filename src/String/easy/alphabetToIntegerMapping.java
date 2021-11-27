package String.easy;

public class alphabetToIntegerMapping {

  public static void main(String[] args) {
    System.out.println(convert("10#11#12"));
  }

  private static String convert(String item) {
    StringBuilder sb = new StringBuilder();
    for (int i = item.length() - 1; i >= 0; i--) {
      if (item.charAt(i) == '#') {
        sb.append((char) ('a' + (item.charAt(i - 1) - '0') + 10 * (item.charAt(i - 2) - '0') - 1));
        i -= 2;
      } else {
        sb.append((char) ('a' + (item.charAt(i) - '0') - 1));
      }
    }
    return sb.reverse().toString();
  }
}
