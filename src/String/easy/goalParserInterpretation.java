package String.easy;

// https://leetcode.com/problems/goal-parser-interpretation/
public class goalParserInterpretation {
  public static void main(String[] args) {}

  public String interpret(String command) {
    return command.replace("()", "o").replace("(al)", "al");
  }

  public String interpret2(String command) {
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < command.length(); i++) {
      if (command.charAt(i) == 'G') {
        str.append('G');
      } else if (command.charAt(i) == '(') {
        if (command.charAt(i + 1) == ')') {
          str.append('o');
        } else {
          str.append("al");
        }
      }
    }
    return str.toString();
  }
}
