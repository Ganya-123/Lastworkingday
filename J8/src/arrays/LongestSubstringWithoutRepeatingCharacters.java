package arrays;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
  public static void main(String[] args) {
    String input = "abccbcbb";
    int output = lengthOfLongestSubstring(input);
    System.out.println(output);

  }

  public static int lengthOfLongestSubstring(String s) {
    Set<Character> ls = new LinkedHashSet<>();
    int start = 0;
    int maxLength = 0;

    for (int end = 0; end < s.length(); end++) {

      while (ls.contains(s.charAt(end))) {
        ls.remove(s.charAt(start));
        start++;

      }
      ls.add(s.charAt(end));
      int length = end - start + 1;
      maxLength = Math.max(maxLength, length);
    }

    return maxLength;
  }
}
