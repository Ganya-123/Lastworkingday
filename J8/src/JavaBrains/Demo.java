package JavaBrains;

public class Demo {
  public static void main(String[] args) {
    String prefix = "an";
    String arr[] = {"Ganya", "Gagab", "Ganii"};
    arr = new String[]{"GAn"};
    String output = findlongestPrefix(arr);
    System.out.println("output : " + output);
  }

  private static String findlongestPrefix(String[] arr) {
    if (arr.length == 0) {
      return "";
    }
    String longestPrefix = arr[0];
    for (int i = 0; i < arr.length; i++) {
      while (arr[i].indexOf(longestPrefix) != 0) {
        longestPrefix = longestPrefix.substring(0, longestPrefix.length() - 1);
      }
    }
    return longestPrefix;
  }
}

