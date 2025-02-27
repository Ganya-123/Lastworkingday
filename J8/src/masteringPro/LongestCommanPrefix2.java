package masteringPro;

public class LongestCommanPrefix2 {
  public static void main(String[] args) {
    String[] arr = {"floo", "f", "fl"};
    String longestPrefix = "";
    char individualChar;
    for (int i = 0; i < arr[0].length(); i++) {
      individualChar = arr[0].charAt(i);
      boolean result = checkIndividualCharAtAllValues(individualChar, arr, i);
      if (result) {
        longestPrefix = longestPrefix + individualChar;
      }
    }
    System.out.println("longest prefix is : " + longestPrefix);
  }

  private static boolean checkIndividualCharAtAllValues(char individualChar, String[] arr, int i) {
    for (int j = 1; j < arr.length; j++) {
      if (arr[j].length() - 1 < i) {
        return false;
      } else if (arr[j].charAt(i) != individualChar) {
        return false;
      }
    }
    return true;
  }
}
