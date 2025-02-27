package Strings;

import java.util.HashMap;

public class WordMapUsingHashMAp2 {
  public static void main(String[] args) {
    String pattern = "abba";
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
    String arr[] = s.split(" ");
    HashMap<Character, String> map = new HashMap<>();
    HashMap<String, Character> map2 = new HashMap<>();

    if (arr.length != pattern.length()) {
      return false;
    }
    for (int i = 0; i < pattern.length(); i++) {
      char indCharacter = pattern.charAt(i);

      String mapValue = map.getOrDefault(indCharacter, null);
      if (mapValue != null && !mapValue.equals( arr[i])) {
        return false;
      } else if (mapValue == null) {
        if (map2.containsKey(arr[i])) {
          return false;
        }
      }
      map.put(indCharacter, arr[i]);
      map2.put(arr[i], indCharacter);
    }
    return true;
  }
}
