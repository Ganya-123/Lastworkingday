package threads;

import java.util.HashMap;

public class Freq {
  public static void main(String[] args) {
    String input = "Ganay";
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < input.length(); i++) {
      if (map.containsKey(input.charAt(i))) {
        map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
      } else {
        map.put(input.charAt(i), 1);
      }
    }
    map.entrySet().stream().forEach(System.out::println);
  }
}
