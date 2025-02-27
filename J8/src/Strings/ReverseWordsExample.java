package Strings;

public class ReverseWordsExample {
  public static void main(String[] args) {
    String input = "Ganya Ht Gowda";
    String output = reverseWords(input);

    System.out.println("Input: " + input);
    System.out.println("Output: " + output);
  }

  public static String reverseWords(String input) {
    String[] words = input.split("\\s+"); // Split the input string into words
    StringBuilder result = new StringBuilder();

    for (String word : words) {
      // Reverse each word and append to the result
      result.append(reverseString(word)).append(" ");
    }

    return result.toString().trim(); // Remove trailing space and return the result
  }

  public static String reverseString(String str) {
    // Convert the string to a char array and reverse it
    char[] charArray = str.toCharArray();
    int start = 0;
    int end = charArray.length - 1;

    while (start < end) {
      // Swap characters at start and end indices
      char temp = charArray[start];
      charArray[start] = charArray[end];
      charArray[end] = temp;

      // Move indices towards the center
      start++;
      end--;
    }

    // Convert the reversed char array back to a string
    return new String(charArray);
  }
}

