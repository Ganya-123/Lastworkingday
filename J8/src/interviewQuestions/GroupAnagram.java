package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
  public static void main(String[] args) {

    String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat"};

    // expected  Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    List<List<String>> output = groupAnagrams(strs);
    System.out.println(output);
  }

  private static List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();
    for (String value : strs) {
      char valueCharArray[] = value.toCharArray();
      Arrays.sort(valueCharArray);
      String sortedVal = new String(valueCharArray);
      if (!map.containsKey(sortedVal)) {
        map.put(sortedVal, new ArrayList<>());
      }
      map.get(sortedVal).add(value);
    }
    return new ArrayList<>(map.values());
  }
}
