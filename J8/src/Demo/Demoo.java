package Demo;

class Solution {
  public int minSubArrayLen(int target, int[] nums) {
    int minLength = Integer.MAX_VALUE; // To keep track of the minimum length of subarray
    int left = 0; // Left pointer of the sliding window
    int currentSum = 0; // To store the current sum of the sliding window

    for (int right = 0; right < nums.length; right++) {
      currentSum += nums[right]; // Add the current element to the window sum
      // Check if the current window's sum is greater than or equal to the target
      while (currentSum >= target) {
        int currentLength = right - left + 1;

        // Update the minimum length
        minLength = Math.min(minLength, currentLength);

        // Shrink the window from the left
        currentSum -= nums[left];
        left++;
      }
    }

    // If no subarray is found, return 0
    return minLength == Integer.MAX_VALUE ? 0 : minLength;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();

    // Test Case 1
    int target1 = 7;
    int[] nums1 = {2, 3, 1, 2, 4, 3};
    System.out.println("Output: " + solution.minSubArrayLen(target1, nums1));
    System.out.println("------------------------");

    // Test Case 2
    int target2 = 4;
    int[] nums2 = {1, 4, 4};
    System.out.println("Output: " + solution.minSubArrayLen(target2, nums2));
    System.out.println("------------------------");

    // Test Case 3
    int target3 = 11;
    int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
    System.out.println("Output: " + solution.minSubArrayLen(target3, nums3));
    System.out.println("------------------------");

    // Test Case 4 (Edge Case)
    int target4 = 15;
    int[] nums4 = {1, 2, 3, 4, 5};
    System.out.println("Output: " + solution.minSubArrayLen(target4, nums4));
  }
}
