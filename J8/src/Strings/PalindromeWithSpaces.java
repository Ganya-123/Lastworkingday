package Strings;

public class PalindromeWithSpaces {
  public static void main(String[] args) {
    String input = "A man, a plan, a canal: Panama"; // output should be true
    Boolean output = checkpalindrome(input);
    System.out.println("The output :" + output);
  }

  private static Boolean checkpalindrome(String s) {
    if(s.equals(" ") || s.length()==1){
      return true;
    }
    int left = 0;
    int right = s.length() - 1;
    while (left <= right) {
      while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
        left++;
      }
      while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
        right--;
      }
      if (left <= right && Character.toLowerCase(s.charAt(right)) == Character.toLowerCase(s.charAt(left))) {
        left++;
        right--;
      } else {
        return false;
      }
    }
    return true;
  }
}
