package Strings;

public class SplitStringONCaps {
  public static void main(String[] args) {
    String input = "MyNameIsGanya";
    int start = 0;
    int end = 0;
    for (int i = 1; i < input.length(); i++) {
      Character value = input.charAt(i);
      if (Character.isUpperCase(value)) {
        end = i;
        System.out.println(input.substring(start, end));
        start = end;
      }

    }
    System.out.println(input.substring(start, input.length()));
  }
}
