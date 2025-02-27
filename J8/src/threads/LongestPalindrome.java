package threads;

public class LongestPalindrome {
  public static void main(String[] args) {


    String input = "bbbab";
    String longest = "";
    for (int i = 0; i < input.length(); i++) {
      for (int j = i + 1; j <= input.length(); j++) {
        String indValue = input.substring(i, j);
        if (indValue.length() >= longest.length() && palindrome(indValue)) {
          longest = indValue;
        }
      }
    }
    System.out.println("longest palindrome is : " + longest);
  }

  private static boolean palindrome(String value) {
    String output = "";
    for (int i = 0; i < value.length(); i++) {
      output = value.charAt(i) + output;
    }
    return value.equals(output);
  }
}
