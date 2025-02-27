package groupBy;

import java.util.Arrays;

public class LongestString {
  public static void main(String[] args) {


    String arr[] = {"Ganya", "abcdefghi", "jkl", "dfhj"};
    String longest = Arrays.stream(arr).reduce((a, b) -> a.length() > b.length() ? a : b).get();
    System.out.println("Longest String is : " + longest);
  }
}
