package threads;

import java.util.HashMap;
import java.util.Map;

public class DemoPractice2 {
  public static void main(String[] args) {
    String input = "w4a3d1";
    printLetterCorrespondingtoDigit(input);
  }

  private static void printLetterCorrespondingtoDigit(String input) {
    StringBuilder builder = new StringBuilder();
    int i = 0;
    Map<Character, Integer> map = new HashMap<>();
    for (i = 0; i < input.length(); i = i + 2) {
      char c = input.charAt(i);
      int correspondingNumber = input.charAt(i + 1) - '0';
      map.put(c, correspondingNumber);
      for (int j = 0; j < correspondingNumber; j++) {
        builder.append(c);
      }
    }
    System.out.println(builder);
  }
}
