package Strings;

public class PalindromeWithSpaces2 {
  public static void main(String[] args) {
    String input = "A man, a plan, a canal: Panama"; // output should be true
    Boolean output = checkpalindrome(input);
    System.out.println("The output :" + output);
  }

  private static Boolean checkpalindrome(String input) {
    int left = 0;
    int right = input.length() - 1;
    while (left <= right) {
      if (!(Character.isLetter(input.charAt(left))) && !(Character.isLetter(input.charAt(right)))) {
        left++;
        right--;
      } else if (!Character.isLetter(input.charAt(left))) {
        left++;
      } else if (!Character.isLetter(input.charAt(right))) {
        right--;
      } else if (Character.toLowerCase(input.charAt(right))
          == Character.toLowerCase(input.charAt(left))) {
        left++;
        right--;
      } else {
        return false;
      }
    }
    return true;
  }
}
