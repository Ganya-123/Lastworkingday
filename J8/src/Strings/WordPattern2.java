package Strings;

import java.util.HashMap;

public class WordPattern2 {
  public static void main(String[] args) {
    //    Input: pattern = "abba", s = "dog cat cat dog"
    //    Output: true
    //
    //    Input: pattern = "abba", s = "dog cat cat fish"
    //    Output: false
    //
    //    Input: pattern = "aaaa", s = "dog cat cat dog"
    //    Output: false
    String pattern = "abbag";
    String s = "dog cat cat dog";
    Boolean output = patternMatching(pattern, s);
    System.out.println(output);
  }

  private static boolean patternMatching(String pattern, String s) {
    HashMap<Character, String> map1 = new HashMap<>();
    HashMap<String, Character> map2 = new HashMap<>();
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < s.length() && k < pattern.length()) {
      while (s.charAt(i) == ' ') {
        i++;
      }
      j = i;
      while (i < s.length() && s.charAt(i) != ' ') {
        i++;
      }
      String substring = s.substring(j, i);
      if (!map1.containsKey(pattern.charAt(k)) && map2.containsKey(substring)) {
        return false;
      } else if (map1.containsKey(pattern.charAt(k))) {
        String oldVal = map1.get(pattern.charAt(k));
        if (!oldVal.equals(substring)) {
          return false;
        }
      }
      map1.put(pattern.charAt(k), substring);
      map2.put(substring, pattern.charAt(k));
      k++;
    }
    return k == pattern.length() && i == s.length();
  }
}
