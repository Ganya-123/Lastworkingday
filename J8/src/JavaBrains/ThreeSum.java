package JavaBrains;

import java.util.*;

public class ThreeSum {
  public static void main(String[] args) {
    int nums[] = {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> findthreetotal = findthreetotal(nums);
    for (List<Integer> triplet : findthreetotal) {
      System.out.println(triplet);
    }

  }

  private static List<List<Integer>> findthreetotal(int[] nums) {
    Arrays.sort(nums);
    int target = 0;
    Set<List<Integer>> set = new HashSet<>();
    for (int i = 0; i < nums.length - 1; i++) {
      int start = i + 1;
      int end = nums.length - 1;
      while (start < end) {
        int total = nums[i] + nums[start] + nums[end];
        if (total == target) {
          set.add(Arrays.asList(nums[i], nums[start], nums[end]));
          start++;
          end--;
        } else if (total > target) {
          end--;


        } else if (total < target) {
          start++;
        }
      }
    }


    return new ArrayList<>(set);
  }
}
