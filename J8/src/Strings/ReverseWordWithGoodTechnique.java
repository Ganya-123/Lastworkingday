package Strings;

public class ReverseWordWithGoodTechnique {
  public static void main(String[] args) {
    String input = " HAi  Hello  ";
    String output = reverseWordsWithoutSpace(input);
    System.out.println(":" + output + ":");
  }

  private static String reverseWordsWithoutSpace(String input) {
    StringBuilder builder = new StringBuilder();
    int i = input.length() - 1;
    int j = i;
    // char[] inputArray=input.toCharArray();
    while (i >= 0) {
      while (i >= 0 && input.charAt(i) == ' ') {
        i--;
      }

      j = i;
      while (i >= 0 && input.charAt(i) != ' ') {
        i--;
      }
      builder.append(input.substring(i+1, j + 1));
      builder.append(" ");
    }
    return builder.toString().trim();
  }
}
