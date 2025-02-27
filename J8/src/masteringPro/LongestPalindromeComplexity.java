package masteringPro;

public class LongestPalindromeComplexity {
  public static void main(String[] args) {
    String input = "abccccdd";
    String output = getHighestPallindrome(input);
    System.out.println("The Highest substr is :" + output);
  }

  public static String getHighestPallindrome(String input) {
    String highest = "";
    for (int i = 1; i < input.length(); i++) {
      int start = i - 1;
      int end = i;
      while (input.charAt(start) == input.charAt(end)) {

        String subStr = input.substring(start, end + 1);
        if (subStr.length() > highest.length()) {
          highest = subStr;
        }
        end++;
        start--;

        if (end >= input.length() || start < 0) {
          break;
        }
      }
      start = i;
      end = i;
      while (input.charAt(start) == input.charAt(end)) {

        String subStr = input.substring(start, end + 1);
        if (subStr.length() > highest.length()) {
          highest = subStr;
        }
        end++;
        start--;

        if (end >= input.length() || start < 0) {
          break;
        }
      }
    }
    return highest;
  }
}
