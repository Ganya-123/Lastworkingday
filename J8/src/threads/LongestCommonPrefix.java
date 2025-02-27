package threads;

public class LongestCommonPrefix {
  public static void main(String[] args) {
    String arr[] = {"Ganya", "Ga", "Ga"};
    String longestPrefix = "";
    for (int i = 0; i < arr[0].length(); i++) {
      Boolean value = findLongest(arr[0].charAt(i), arr, i);
      if (value) {
        longestPrefix = longestPrefix + arr[0].charAt(i);
      }
    }
    System.out.println(longestPrefix);
  }

  private static boolean findLongest(char value, String arr[], int pos) {
    for (int i = 1; i < arr.length; i++) {
      if (pos >= arr[i].length()) {
        return false;
      } else if (arr[i].charAt(pos) != value) {
        return false;
      }
    }

    return true;
  }

}
