package Strings;

import java.util.HashMap;

public class IsomorphicStringsComplexity {
  public static void main(String[] args) {
    String s = "egg";
    String t = "add";
    boolean output = isIsomorphic(s, t);
    System.out.println(output);
  }

  private static boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    HashMap<Character, Character> map1 = new HashMap<>();
    HashMap<Character, Character> map2 = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      if (!map1.containsKey(s.charAt(i)) && map2.containsKey(t.charAt(i))) {
        return false;
      } else if (map1.containsKey(s.charAt(i))) {
        char oldvalue = map1.get(s.charAt(i));
        if (oldvalue != t.charAt(i)) {
          return false;
        }
      } else {
        map1.put(s.charAt(i), t.charAt(i));
        map2.put(t.charAt(i), s.charAt(i));
      }
    }

    return true;
  }
}
