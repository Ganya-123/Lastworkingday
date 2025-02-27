package threads;

import java.util.Stack;

public class DemoPractice {
  public static void main(String[] args) {
    String input = ")))("; // output should be 4
    int count = findCountOfBracketClosingRequiredCounter(input);
    System.out.println(count);
  }

  // approach1
  private static int findCountOfBracketClosingRequiredCounter(String input) {

    int openCounter = 0;
    int closedCounter = 0;

    for (int i = 0; i < input.length(); i++) {
      Character value = input.charAt(i);

      if (isOpenBracket(value)) {

        openCounter++;
      } else {
        if (openCounter > 0) {
          openCounter--;
        } else {
          closedCounter++;
        }
      }
    }

    int result = openCounter + closedCounter;
    return result;
  }

  // approach2
  private static int findCountOfBracketClosingRequiredStack(String input) {
    Stack<Character> stackOpen = new Stack<>();
    Stack<Character> stackClosed = new Stack<>();

    for (int i = 0; i < input.length(); i++) {
      Character value = input.charAt(i);

      if (isOpenBracket(value)) {
        stackOpen.push(value);
      } else {
        if (stackOpen.size() > 0) {
          stackOpen.pop();
        } else {
          stackClosed.push(value);
        }
      }
    }
    return stackOpen.size() + stackClosed.size();
  }

  private static boolean isOpenBracket(Character value) {
    if (value == '(') {
      return true;
    }
    return false;
  }
}
