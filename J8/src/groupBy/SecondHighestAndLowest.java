package groupBy;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestAndLowest {
  public static void main(String[] args) {
    int arr[] = {21, 5, 9, 30, 8, 43, 5, 1};

    //2nd Highest
    // boxed because u need to convert to int to Integer
    Integer secondHighest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
    System.out.println("second highest element is :" + secondHighest);

    //2nd Lowest
    // boxed because u need to convert to int to Integer
    Integer secondLowest = Arrays.stream(arr).boxed().sorted().skip(1).findFirst().get();
    System.out.println("second highest element is :" + secondLowest);
  }
}
