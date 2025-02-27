package threads;

public class DemoPracticeThree {
  public static void main(String[] args) {
    String input = "wwweeuuui"; // output should be w4e2h1i2
    String output = countSubsequentLetterWithCount(input);
    System.out.println(output);
  }

  private static String countSubsequentLetterWithCount(String input) {
    int i = 0;
    char c = input.charAt(i);
    int count = 0;
    StringBuilder builder=new StringBuilder();
    while (i < input.length()) {
      if (input.charAt(i) == c) {
        count++;
      }
      else{
        builder.append(c);
        builder.append(count);
         c = input.charAt(i);
         count=1;
      }
      i++;
    }
    builder.append(c);
    builder.append(count);
    return builder.toString();
  }
}
