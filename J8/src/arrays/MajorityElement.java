package arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
  public static void main(String[] args) {
    int nums[] = {2, 2, 1, 1, 1, 2, 2};
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        map.put(nums[i], map.get(nums[i]) + 1);
      } else {
        map.put(nums[i], 1);
      }
    }
    int maxnum = 0;
    int maxCount = 0;
    for (Map.Entry<Integer, Integer> input : map.entrySet()) {
      if (input.getValue() > maxCount) {
        maxCount = input.getValue();
        maxnum = input.getKey();
      }
    }
    System.out.println(maxnum + " " + maxCount);
  }
}
