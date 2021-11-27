package String.easy;

// https://leetcode.com/problems/determine-if-string-halves-are-alike/
public class ifStringHalvesAreAlike {
  public static void main(String[] args) {}

  public boolean halvesAreAlike(String s) {
    String vowels = "aeiouAEIOU";
    int mid = s.length() / 2;
    int count = 0;
    for (int i = 0; i < mid; i++) {
      count += (vowels.indexOf(s.charAt(i)) > -1 ? 1 : 0);
    }
    for (int i = mid; i < mid * 2; i++) {
      count -= (vowels.indexOf(s.charAt(i)) > -1 ? 1 : 0);
    }
    return count == 0;
  }
}
