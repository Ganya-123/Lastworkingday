package interviewQuestions;

import java.util.Stack;

public class Paranthesis {
  static Stack<Character> stack = new Stack<>();

  public static void main(String[] args) {
    String brackets = "[[";
    boolean output = isMatching(brackets);
    if (output) {
      System.out.println("Braces are matching");
    } else {
      System.out.println("Braces are not matching");
    }
  }

  private static boolean isMatching(String input) {
    for (int i = 0; i < input.length(); i++) {
      char value = input.charAt(i);
      if (isOpeningBraces(value)) {
        stack.push(value);
      } else if (stack.isEmpty()) {
        return false;

      } else if (isClosingBraces(value)) {
        boolean match = isMatching(value, stack.pop());
        if (!match) {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }

  private static boolean isMatching(char closingBrace, char popValue) {

    return ((popValue == '(' && closingBrace == ')')
        || (popValue == '[' && closingBrace == ']')
        || (popValue == '{' && closingBrace == '}'));
  }

  private static boolean isClosingBraces(char value) {

    return (value == ']' || value == '}' || value == ')');
  }

  private static boolean isOpeningBraces(char value) {

    return (value == '[' || value == '{' || value == '(');
  }
}
