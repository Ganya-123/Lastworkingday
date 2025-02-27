package arrays;

import java.util.HashMap;

public class ContainsDuplicate2Complexity {
  public static void main(String[] args) {
    int[] arr = {1,0,1,1};
    int k = 1;
    Boolean result = containsNearbyDuplicate(arr, k);
    System.out.println(result);
  }

  public static boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
        return true;
      } else {
        map.put(nums[i], i);
      }
    }
    return false;
  }
}
