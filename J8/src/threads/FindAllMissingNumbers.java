package threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllMissingNumbers {
  public static void main(String[] args) {
    int[] arr = new int[]{
      1, 3, 4, -2,
    };
    System.out.println(findFirstMissingElement(arr));


  }

  private static List<Integer> findFirstMissingElement(int[] arr) {
    List<Integer> ls = new ArrayList<>();
    Arrays.sort(arr);
    for (int i = 1; i < arr.length; i++) {
      int current = arr[i];
      int back = arr[i - 1];
      while (back + 1 < current) {
        ls.add(++back);

      }

    }

    return ls;
  }
}
