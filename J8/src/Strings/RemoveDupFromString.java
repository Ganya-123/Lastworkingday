package Strings;

import java.util.HashSet;

public class RemoveDupFromString {
  public static void main(String[] args) {
    String input = "Ganyyaaa";
    String output = "";
    for (int i = 0; i < input.length(); i++) {
      char value = input.charAt(i);
      if (!output.contains(String.valueOf(value))) {
        output = output + value;

      }
    }
    System.out.println(output);


    String input2 = "Ganyaaaa";
    StringBuilder stringBuilder = new StringBuilder();
    HashSet<Character> set = new HashSet<>();
    for (int i = 0; i < input2.length(); i++) {
      Character value2 = input2.charAt(i);
      if (!set.contains(value2)) {
        set.add(value2);
        stringBuilder.append(value2);
      }

    }
    System.out.println(stringBuilder);
  }
}
