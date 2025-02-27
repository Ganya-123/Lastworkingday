package test.java;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
  public static void main(String[] args) {
    String input = "234";
    List<String> output = findCombinations(input);
    System.out.println(output);
  }

  private static List<String> findCombinations(String input) {
    int index = 0;
    List<String> output = new ArrayList<>();
    String[] arr = {"", "", "abc", "def","ghi"};
    StringBuilder builder = new StringBuilder();
    findCombinationsLetters(input, output, builder, arr, index);
    return output;
  }

  private static void findCombinationsLetters(String input, List<String> output, StringBuilder builder, String[] arr, int index) {
    if (index == input.length()) {
      output.add(builder.toString());
      return;
    }
    String indInput = arr[input.charAt(index) - '0'];

    for (char c : indInput.toCharArray()) {
      builder.append(c);
      findCombinationsLetters(input, output, builder, arr, index + 1);
      builder.deleteCharAt(builder.length() - 1);

    }

  }


}
