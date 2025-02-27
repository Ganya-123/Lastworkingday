package test.java;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
  // Predefined mappings for digits to letters
  private static final String[] MAPPINGS = {
    "",    // 0
    "",    // 1
    "abc", // 2
    "def", // 3
    "ghi", // 4
    "jkl", // 5
    "mno", // 6
    "pqrs", // 7
    "tuv", // 8
    "wxyz" // 9
  };

  public List<String> letterCombinations(String digits) {
    if (digits == null || digits.isEmpty()) {
      return new ArrayList<>();
    }

    List<String> result = new ArrayList<>();
    StringBuilder current = new StringBuilder();

    // Start backtracking
    backtrack(result, digits, current, 0);
    return result;
  }

  private void backtrack(List<String> result, String digits, StringBuilder current, int index) {
    // Base case: If we've processed all digits, add the combination to results
    if (index == digits.length()) {
      result.add(current.toString());
      return;
    }

    // Get the letters for the current digit
    String letters = MAPPINGS[digits.charAt(index) - '0'];

    // Explore each letter
    for (char letter : letters.toCharArray()) {
      current.append(letter);  // Add the letter
      backtrack(result, digits, current, index + 1); // Recur
      current.deleteCharAt(current.length() - 1);    // Backtrack
    }
  }

  public static void main(String[] args) {
    LetterCombinations lc = new LetterCombinations();

    System.out.println(lc.letterCombinations("23")); // ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
    System.out.println(lc.letterCombinations(""));   // []
    System.out.println(lc.letterCombinations("2"));  // ["a", "b", "c"]
  }
}
