package masteringPro;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeMadeFromLetters {
  public static void main(String[] args) {
    String input = "abccccdd";
    int output = getLenthofLoinngest(input);
    System.out.println("The length of longest palindrome that can be made from :" + output);
  }

  private static int getLenthofLoinngest(String input) {


    Map<Character, Integer> map = new HashMap<>();
    Boolean odd = false;
    for (int i = 0; i < input.length(); i++) {
      if (map.containsKey(input.charAt(i))) {
        map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
      } else {
        map.put(input.charAt(i), 1);
      }
    }
    int count = 0;
    for (int val : map.values()) {
      if (val % 2 == 0) {
        count = count + val;
      } else {
        count = count + (val - 1);
        odd = true;
      }
    }
    return odd ? count + 1 : count;
  }

}
