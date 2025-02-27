package Strings;

public class IsSubsequence {
  public static void main(String[] args) {
    //    Example 1:
    //
    //    Input: s = "abc", t = "ahbgdc"
    //    Output: true
    //    Example 2:
    //
    //    Input: s = "axc", t = "ahbgdc"
    //    Output: false
    String s = "abc";
    String t = "ahbgdc";
    Boolean output = findSubsequence(s, t);
    System.out.println(output);
  }

  private static Boolean findSubsequence(String s, String t) {
    int i = 0;
    int j = 0;
    while (j < t.length() && i < s.length()) {
      if (s.charAt(i) == t.charAt(j)) {
        i++;
      }
      j++;
    }

    return i == s.length();
  }
}
