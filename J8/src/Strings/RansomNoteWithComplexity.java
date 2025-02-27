package Strings;

public class RansomNoteWithComplexity {
  public static void main(String[] args) {
    String ransomNote = "aa";
    String magazine = "aab";
    Boolean output = constructOrNot(ransomNote, magazine);
    System.out.println(output);
  }

  private static Boolean constructOrNot(String ransomNote, String magazine) {
    int[] alphabetArr = new int[26];
    for (char c : magazine.toCharArray()) {
      alphabetArr[c - 'a']++;
    }
    for (char c : ransomNote.toCharArray()) {
      if (alphabetArr[c - 'a'] == 0) {
        return false;
      } else {
        alphabetArr[c - 'a']--;
      }
    }
    return true;
  }
}
