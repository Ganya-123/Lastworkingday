package slidingWindow;

public class MinimumSizeSubarray {
  public static void main(String[] args) {

// Test Case 1
    int target1 = 7;
    int[] nums1 = {2, 3, 1, 2, 4, 3};
    System.out.println("Output: " + minSubArrayLen(target1, nums1));
    System.out.println("------------------------");

    // Test Case 2
    int target2 = 4;
    int[] nums2 = {1, 4, 4};
    System.out.println("Output: " + minSubArrayLen(target2, nums2));
    System.out.println("------------------------");

    // Test Case 3
    int target3 = 11;
    int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
    System.out.println("Output: " + minSubArrayLen(target3, nums3));
    System.out.println("------------------------");
  }

  public static int minSubArrayLen(int target, int[] nums) {

    int sum = 0;
    int minsubArrayLenth = Integer.MAX_VALUE;
    int start = 0;
    for (int end = 0; end < nums.length; end++) {
      sum = sum + nums[end];
      while (sum >= target) {
        minsubArrayLenth = Math.min(minsubArrayLenth, end - start + 1);
        sum = sum - nums[start];
        start++;

      }

    }

    return minsubArrayLenth == Integer.MAX_VALUE ? 0 : minsubArrayLenth;
  }
}
