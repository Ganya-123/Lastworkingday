package interviewQuestions;

import java.util.HashMap;

public class AnagramsUsingMap {

  public static void main(String[] args) {
    String a = "ABCD";
    String b = "DCAA";
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < a.length(); i++) {
      Character val = a.charAt(i);
//      if (map.containsKey(val)) {
//        map.put(val, map.get(val) + 1);
//      } else {
//        map.put(val, 1);
//      }
      map.put(val, map.getOrDefault(val, 0) + 1);
    }
    for (int i = 0; i < b.length(); i++) {
      Character val = b.charAt(i);
//      if (map.containsKey(val)) {
//        map.put(val, map.get(val) - 1);
//      } else {
//        map.put(val, 1);
//      }
      map.put(val,map.getOrDefault(val,0)-1);
    }
    boolean result = map.entrySet().stream().allMatch(i -> i.getValue() == 0);
    if (result) {
      System.out.println("Anagram");
    } else {
      System.out.println("Not Anagram");
    }
  }
}
