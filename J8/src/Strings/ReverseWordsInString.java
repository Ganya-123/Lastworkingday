package Strings;

import java.util.Scanner;

public class ReverseWordsInString {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
    String output = reverseWords(input);
    System.out.println(output);
  }

  private static String reverseWords(String input) {
    char[] charArray = input.toCharArray();
    int start = 0;

    for (int end = 0; end < charArray.length; end++) {
      if (charArray[end] == ' ') {
        reverse(charArray, start, end - 1);
        start = end + 1;
      }
    }

    // Reverse the last word (or the only word if there's only one)
    reverse(charArray, start, charArray.length - 1);

    return new String(charArray);
  }

  private static void reverse(char[] array, int start, int end) {
    while (start < end) {
      // Swap characters at start and end indices
      char temp = array[start];
      array[start] = array[end];
      array[end] = temp;

      // Move indices towards each other
      start++;
      end--;
    }
  }
}
