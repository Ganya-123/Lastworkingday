package threads;

import java.util.Arrays;

public class ReverseVowels {
  public static void main(String[] args) {
    String input = "leetcode";
    String output = "leotcede";
    String vowels = "aeiouAEIOU";
    char[] charArray = input.toCharArray();
    int start = 0;
    int end = input.length() - 1;
    boolean startVal = true;
    boolean endVal = true;
    while (start < end) {

      String startChar = "" + input.charAt(start);
      if (!vowels.contains(startChar)) {
        startVal = false;
        start++;
      } else {
        startVal = true;
      }
      String endChar = "" + input.charAt(end);
      if (!vowels.contains(endChar)) {
        endVal = false;
        end--;
      } else {
        endVal = true;
      }
      if (startVal && endVal) {
        char temp = charArray[start];
        charArray[start] = charArray[end];
        charArray[end] = temp;
        start++;
        end--;
      }

    }
    System.out.println("charArray" + Arrays.toString(charArray));
  }
}
