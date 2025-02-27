package JavaBrains;

public class StringSemo {
  public static void main(String[] args) {
    String input = "sas,malayalam,amalayalama,";
    String longestSubstr = "";
    for (int i = 0; i < input.length(); i++) {
      for (int j = i + 1; j <= input.length(); j++) {
        StringBuilder subStr = new StringBuilder(input.substring(i, j));
        if (subStr.length() > longestSubstr.length() && isPalindrome(subStr.toString(), 0, subStr.length() - 1)) {
          longestSubstr = String.valueOf(subStr);
        }

      }
    }
    System.out.println("The longest palindrome substring is :" + longestSubstr);

  }

  private static boolean isPalindrome(String input, int start, int end) {

    while (start < end) {
      char char1 = input.charAt(start);
      char char2 = input.charAt(end);
      if (char1 != char2) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }
}
