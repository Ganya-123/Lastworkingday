package Strings;

public class RemoveSpecialCharacter {
  public static void main(String[] args) {
    String input = "G!ed#T";
    String output = removeSpecial(input);
    System.out.println(output);
  }

  private static String removeSpecial(String input) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      if (Character.isLetter(input.charAt(i)) && Character.isUpperCase(input.charAt(i))) {
        builder.append(Character.toLowerCase(input.charAt(i)));
      } else if (Character.isLetter(input.charAt(i)) && Character.isLowerCase(input.charAt(i))) {
        builder.append(Character.toUpperCase(input.charAt(i)));
      }
    }
    return builder.toString();
  }
}
