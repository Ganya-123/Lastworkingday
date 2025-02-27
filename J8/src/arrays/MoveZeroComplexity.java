package arrays;

import java.util.Arrays;

public class MoveZeroComplexity {
  public static void moveZeroes(int[] nums) {
    int left = 0;
    int right = 0;
    while (right < nums.length) {
      if (nums[right] != 0) {
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
        left++;
      }
      right++;
    }
  }

  public static void main(String[] args) {
    int[] nums1 = {1, 0,1,3, 0, 12};
    moveZeroes(nums1);
    System.out.println("Output: " + Arrays.toString(nums1));

    int[] nums2 = {0};
    moveZeroes(nums2);
    System.out.println("Output: " + Arrays.toString(nums2));
  }
}
