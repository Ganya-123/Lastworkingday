package Strings;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
  public static void main(String[] args) {
    String ransomNote = "aa";
    String magazine = "b";
    Boolean output = constructOrNot(ransomNote, magazine);
    System.out.println(output);
  }

  private static Boolean constructOrNot(String ransomNote, String magazine) {
    Map<Character, Integer> ransomNoteCount = new HashMap<>();
    Map<Character, Integer> magazineCount = new HashMap<>();

    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < ransomNote.length(); i++) {
      ransomNoteCount.put(
          ransomNote.charAt(i), ransomNoteCount.getOrDefault(ransomNote.charAt(i), 0) + 1);
    }
    for (int i = 0; i < magazine.length(); i++) {
      magazineCount.put(magazine.charAt(i), magazineCount.getOrDefault(magazine.charAt(i), 0) + 1);
    }
    for (char c : ransomNoteCount.keySet()) {
      if (magazineCount.getOrDefault(c, 0) < ransomNoteCount.get(c)) {
        return false;
      }
    }
    return true;
  }
}
