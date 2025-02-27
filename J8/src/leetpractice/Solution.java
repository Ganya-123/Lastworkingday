package leetpractice;

import java.util.Stack;

class Solution {
  public static void main(String[] args) {
    Boolean output = isValid("[[");
    if (output) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }

  private static boolean isValid(String s) {

    Stack<String> stack = new Stack();
    for (int i = 0; i < s.length(); i++) {
      String indValue = String.valueOf(s.charAt(i));
      if (isOpening(indValue)) {
        stack.add(indValue);
      } else if (stack.isEmpty()) {
        return false;

      } else {
        String popValue = stack.pop();
        Boolean bool = checkValidation(indValue, popValue);
        if (!bool) {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }

  private static boolean isOpening(String indValue) {
    if (indValue.equals("(") || indValue.equals("[") || indValue.equals("{")) {
      return true;
    }
    return false;
  }

  private static boolean checkValidation(String indValue, String popValue) {
    if (indValue.equals(")") && popValue.equals("(")) {
      return true;
    } else if (indValue.equals("}") && popValue.equals("{")) {
      return true;
    } else if (indValue.equals("]") && popValue.equals("[")) {
      return true;
    }
    return false;
  }
}
