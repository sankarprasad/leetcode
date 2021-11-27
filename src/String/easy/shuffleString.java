package String.easy;

// https://leetcode.com/problems/shuffle-string/
public class shuffleString {
  public static void main(String[] args) {}

  public String restoreString(String s, int[] indices) {
    char[] ch = new char[indices.length];
    for (int i = 0; i < indices.length; i++) {
      ch[indices[i]] = s.charAt(i);
    }
    return new String(ch);
  }
}
