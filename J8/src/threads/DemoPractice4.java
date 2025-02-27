package threads;

public class DemoPractice4 {
  public static void main(String[] args) {
    String input = "wwweethhh";
    String output = countSubsequentLetterWithCount(input);
    System.out.println(output);
  }

  private static String countSubsequentLetterWithCount(String input) {
    int i = 1;
    int count = 0;
    int j = 0;
    StringBuilder builder = new StringBuilder();
    while (i < input.length()) {
      if (input.charAt(i) != input.charAt(i - 1)) {
        builder.append(input.charAt(j));
        builder.append(i - j);
        j = i;
      }
      i++;
    }
    builder.append(input.charAt(j));
    builder.append(i - j);
    return builder.toString();
  }
}
