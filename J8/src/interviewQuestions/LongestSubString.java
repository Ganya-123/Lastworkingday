package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
  public static void main(String[] args) {
    String input = "ababcdefb";
    longest(input);

  }

  public static void longest(String str) {
    String overAllLongest = "";
    String firstLongest = "";

    Set<Character> set = new HashSet<>();
    for (int i = 0; i < str.length(); i++) {
      char value = str.charAt(i);
      if (set.contains(value)) {
        set.clear();
        overAllLongest = "";
      } else {
        set.add(value);
        overAllLongest = overAllLongest + value;
      }
      if (overAllLongest.length() > firstLongest.length()) {
        firstLongest = overAllLongest;
      }
    }
    System.out.println(firstLongest);
  }
}

