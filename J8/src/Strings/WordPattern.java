package Strings;

import java.util.HashMap;

public class WordPattern {
  public static void main(String[] args) {
    //    Input: pattern = "abba", s = "dog cat cat dog"
    //    Output: true
    //
    //    Input: pattern = "abba", s = "dog cat cat fish"
    //    Output: false
    //
    //    Input: pattern = "aaaa", s = "dog cat cat dog"
    //    Output: false
    String pattern = "abba";
    String s = "dog cat cat dg";
    Boolean output = patternMatching(pattern, s);
    System.out.println(output);
  }

  private static boolean patternMatching(String pattern, String s) {
    HashMap<Character, String> map1 = new HashMap<>();
    HashMap<String, Character> map2 = new HashMap<>();
    String arr[] = s.split(" ");
    if (pattern.length() != arr.length) {
      return false;
    }
    for (int i = 0; i < pattern.length(); i++) {
      if (!map1.containsKey(pattern.charAt(i)) && map2.containsKey(arr[i])) {
        return false;
      } else if (map1.containsKey(pattern.charAt(i))) {
        String oldValue = map1.get(pattern.charAt(i));
        if (!oldValue.equals(arr[i])) {
          return false;
        }
      }
      map1.put(pattern.charAt(i), arr[i]);
      map2.put(arr[i], pattern.charAt(i));
    }
    return true;
  }
}
