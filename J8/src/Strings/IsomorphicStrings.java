package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class IsomorphicStrings {
  public static void main(String[] args) {
    String s = "egg";
    String t = "add";
    boolean output = isIsomorphic(s, t);
    System.out.println(output);
  }

  private static boolean isIsomorphic(String s, String t) {
    HashMap<Character, Character> map1 = new HashMap<>();
    HashMap<Character, Character> map2 = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      if (!map1.containsKey(s.charAt(i)) && map2.containsKey(t.charAt(i))) {
        return false;
      }
      if (!map1.containsKey(s.charAt(i)) && !map2.containsKey(s.charAt(i))) {
        map1.put(s.charAt(i),t.charAt(i));
        map2.put(t.charAt(i),s.charAt(i));
      }
    }
    char arr[] = s.toCharArray();
    for (int j = 0; j < s.length(); j++) {
      char val = map1.get(s.charAt(j));
      arr[j] = val;
    }
    boolean output = Arrays.equals(arr, t.toCharArray());
    return output;
  }
}
