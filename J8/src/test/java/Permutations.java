package test.java;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
  public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(result, nums, new ArrayList<>(), new boolean[nums.length]);
    return result;
  }

  private static void backtrack(List<List<Integer>> result, int[] nums, List<Integer> current, boolean[] used) {
    // Base case: if the current permutation size equals nums length, add to result
    if (current.size() == nums.length) {
      result.add(new ArrayList<>(current));
      return;
    }

    for (int i = 0; i < nums.length; i++) {
      if (used[i]) continue; // Skip if the number is already used

      current.add(nums[i]);
      used[i] = true;

      backtrack(result, nums, current, used);
      current.remove(current.size() - 1);
      used[i] = false;
    }
  }

  public static void main(String[] args) {
    int[] nums1 = {0,1, 2};
    System.out.println("Permutations of [1, 2, 3]: " + permute(nums1));

    int[] nums2 = {0, 1};
    System.out.println("Permutations of [0, 1]: " + permute(nums2));

    int[] nums3 = {1};
    System.out.println("Permutations of [1]: " + permute(nums3));
  }
}
