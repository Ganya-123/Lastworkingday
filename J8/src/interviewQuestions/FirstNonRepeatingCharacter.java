package interviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNonRepeatingCharacter {
  public static void main(String[] args) {
    String input = "aabbccmdef";
    Map<Character, Integer> map = new LinkedHashMap<>();
    for (Character ch : input.toCharArray()) {
      if (map.containsKey(ch)) {
        map.put(ch, (map.get(ch)) + 1);
      } else {
        map.put(ch, 1);
      }
    }
    //1st way
    Optional<Map.Entry<Character, Integer>> output = map.entrySet().stream().filter(i -> i.getValue() == 1).findFirst();
    if (output.isPresent()) {
      System.out.println("output 1 : " + output.get());
    }
    //// 2nd way
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 1) {
        System.out.println("output 2 : " + entry.getValue());
        break;
      }
    }
  }
}
