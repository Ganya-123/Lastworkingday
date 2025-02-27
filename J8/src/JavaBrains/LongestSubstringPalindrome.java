package JavaBrains;

public class LongestSubstringPalindrome {
  public static void main(String[] args) {
    String input = "sas,malayalam,amalayalama,";
    String longestSubstr = "";
    for (int i = 0; i < input.length(); i++) {
      for (int j = i + 1; j <= input.length(); j++) {
        StringBuilder subStr = new StringBuilder(input.substring(i, j));
        if (subStr.length() > longestSubstr.length() && isPalindrome(subStr.toString())) {
          longestSubstr = String.valueOf(subStr);
        }

      }
    }
    System.out.println("The longest palindrome substring is :" + longestSubstr);

  }

  private static boolean isPalindrome(String input) {
    String output = "";
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      output = c + output;
    }
    if (input.equals(output)) {
      return true;
    } else {
      return false;
    }
  }
}
