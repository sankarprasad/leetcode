package String.easy;

import java.util.List;

// https://leetcode.com/problems/count-items-matching-a-rule/
public class countItemsMatchingARule {
  public static void main(String[] args) {}

  public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int key = 0, matches = 0;
    switch (ruleKey) {
      case "type":
        key = 0;
        break;
      case "color":
        key = 1;
        break;
      case "name":
        key = 2;
        break;
    }
    for (List<String> arr : items) {
      if (arr.get(key).equals(ruleValue)) matches++;
    }
    return matches;
  }
}
