package JavaBrains;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumNlogn {
  public static void main(String[] args) {
    int target = 20;
    int num[] = {7, 8, 15, 3, 2, 5, 1, 10};
    int start = 0;
    int end = num.length - 1;

    // Arrays.sort(num);
    int result[] = findSum(target, num);
    if (result != null) {
      System.out.println(result[0] + " " + result[1]);
    }

  }

  private static int[] findSum(int target, int[] num) {
    int start = 0;
    int end = num.length - 1;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < num.length; i++) {
      map.put(num[i], i);
    }
    Arrays.sort(num);
    while (start < end) {
      int sum = num[start] + num[end];
      if (sum == target) {
        return new int[]{map.get(num[start]), map.get(num[end])};
      } else if (sum > target) {
        end--;

      } else if (sum < target) {
        start++;
      }
    }

    return null;
  }
}
