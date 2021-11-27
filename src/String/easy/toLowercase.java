package String.easy;

public class toLowercase {
  public static void main(String[] args) {}

  public String toLowerCase(String s) {
    char[] ch = new char[s.length()];
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      int c = s.charAt(i);
      int diff = 'a' - 'A';
      if (c >= 'A' && c <= 'Z') {
        ch[i] = (char) (c + diff);
      } else {
        ch[i] = s.charAt(i);
      }
    }

    for (char c : ch) {
      str.append(c);
    }
    return str.toString();
  }
}
