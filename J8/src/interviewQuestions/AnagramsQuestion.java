package interviewQuestions;

import java.util.Locale;

public class AnagramsQuestion {

  static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) {
      return false;
    }
    while (!a.isEmpty()) {
      String temp = a.substring(0, 1);
      a = a.replaceAll(temp, "");
      b = b.replaceAll(temp, "");
      if (a.length() != b.length()) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    String a="Ganya".toLowerCase();
    String b="Manya".toLowerCase();
    boolean result= isAnagram(a, b);
    if(result){
      System.out.println("Anagrams");
    }
    else {
      System.out.println("Not Anagrams");
    }
  }
}
