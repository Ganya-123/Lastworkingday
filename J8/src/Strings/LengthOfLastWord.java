package Strings;

public class LengthOfLastWord {
  public static void main(String[] args) {
    String input = "   fly me   to   the moon  "; // output should be 4(moon)
    int output = findLength(input);
    System.out.println(output);
    // hai hello
  }

  private static int findLength(String input) {
    int i = input.length() - 1;
    int j = i;
    while(i>=0 && input.charAt(i)==' '){
      i--;
    }
    j=i;
    while (i>=0 && input.charAt(i)!=' '){
      i--;
    }
    return j-i;
  }
}
