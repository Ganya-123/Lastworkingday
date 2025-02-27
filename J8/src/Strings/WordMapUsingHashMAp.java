package Strings;

import java.util.HashMap;

public class WordMapUsingHashMAp {
  public static void main(String[] args) {
    String pattern = "abbah";
    String s = "dog cat cat dog ";
    //    Example 1:
    //    Input: pattern = "abba", s = "dog cat cat dog"
    //    Output: true
    //    Explanation:
    //    The bijection can be established as:
    //    'a' maps to "dog".
    //    'b' maps to "cat".
    //      Example 2:
    //
    //    Input: pattern = "abba", s = "dog cat cat fish"
    //    Output: false
    //
    //    Example 3:
    //    Input: pattern = "aaaa", s = "dog cat cat dog"
    //    Output: false
    Boolean output = findsameletterPointsToSameWord(pattern, s);
    System.out.println(output);
  }

  private static Boolean findsameletterPointsToSameWord(String pattern, String s) {
    HashMap<Character, String> map = new HashMap<>();
    HashMap<String, Character> map2 = new HashMap<>();
    int i = 0;
    int j = 0;
    for (int k = 0; k < pattern.length(); k++) {
      while (i < s.length() && s.charAt(i) == ' ') {
        i++;
      }
      j = i;
      while (i < s.length() && s.charAt(i) != ' ') {
        i++;
      }
      String substring = s.substring(j, i);

      String value = map.getOrDefault(pattern.charAt(k), null);
      if (value == null && map2.containsKey(substring)) {
        return false;
      }
      if (!value.equals(substring)) {
        return false;
      } else {
        map.put(pattern.charAt(k), substring);
        map2.put(substring, pattern.charAt(k));
      }
    }
    return true;
  }
}
