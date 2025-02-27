package JavaBrains;

public class ReverseUsingStringBuilder {
  public static void main(String[] args) {
    String a = "Ganya";
    System.out.println(reverseInbuilt(a));
    System.out.println(reverseManually(a));
  }

  static String reverseInbuilt(String input) {
    return new StringBuilder(input).reverse().toString();

  }

  static String reverseManually(String input) {
    StringBuilder sb = new StringBuilder();

    ;
    for (int i = input.length() - 1; i >= 0; i--) {
      sb.append(input.charAt(i));
    }
    return sb.toString();
  }
}
