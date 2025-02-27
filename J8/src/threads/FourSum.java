package threads;

import java.util.*;

public class FourSum {
  public static void main(String[] args) {
    int[] arr = {1000000000, 1000000000, 1000000000, 1000000000};
    int target = -294967296;
    List<List<Integer>> output = fourTarget(arr, target);
    System.out.println(output.size());
  }

  private static List<List<Integer>> fourTarget(int[] arr, int target) {
    Arrays.sort(arr);
    Set<List<Integer>> ls = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int start = j + 1;
        int end = arr.length - 1;
        while (start < end) {
          long total = (long) arr[i] + arr[j] + arr[start] + arr[end];
          if (total == target) {
            ls.add(Arrays.asList(arr[i], arr[j], arr[start], arr[end]));
            start++;
            end--;
          } else if (total > target) {
            end--;

          } else if (total < target) {
            start++;
          }
        }
      }
    }
    return new ArrayList<>(ls);
  }
}
