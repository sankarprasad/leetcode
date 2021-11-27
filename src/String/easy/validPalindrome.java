package String.easy;

// https://leetcode.com/problems/valid-palindrome/
public class validPalindrome {
  public static void main(String[] args) {}

  public boolean isPalindrome(String s) {
    String formattedString = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
    for (int i = 0; i < formattedString.length() / 2; i++) {
      if (formattedString.charAt(i) != formattedString.charAt(formattedString.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }

  public boolean isPalindromeWay2(String s) {
    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
      if (!Character.isLetterOrDigit(s.charAt(i))) {
        i++;
        continue;
      }
      if (!Character.isLetterOrDigit(s.charAt(j))) {
        j--;
        continue;
      }
      char l = Character.toLowerCase(s.charAt(i));
      char h = Character.toLowerCase(s.charAt(j));
      if (l != h) return false;
      i++;
      j--;
    }

    return true;
  }
}
