package JavaBrains;

public class CheckCapitalLetters {
  public static void main(String[] args) {
    String input = "ganya";
    boolean result1 = validateString(input);
    if (result1) {
      System.out.println("Valid String");
    } else {
      System.out.println("Not a valid String");
    }
  }

  private static boolean validateString(String input) {
    int capsCount = 0;
    for (int i = 0; i < input.length(); i++) {
      if (Character.isUpperCase(input.charAt(i))) {
        capsCount = capsCount + 1;
      }
    }
    if (Character.isUpperCase(input.charAt(0)) && capsCount == 1) {
      return true;
    } else if (capsCount == input.length()) {
      return true;
    } else if (capsCount == 0) {
      return true;
    }
    return false;
  }
}
