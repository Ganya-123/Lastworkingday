package threads;

public class ValidAnagram {
  public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";
    Boolean result = isAnagrams(s, t);
    if (result) {
      System.out.println("Valid anagram");
    } else {
      System.out.println("Not valid");
    }
  }

  private static boolean isAnagrams(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    while (!s.isEmpty()) {
      String temp = s.substring(0, 1);
      s = s.replace(temp, "");
      t = t.replace(temp, "");
      if (s.length() != t.length()) {
        return false;
      }

    }
    return true;
  }
}
