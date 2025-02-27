package arrays;

public class ArrayRightLeet {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    // 7,6,5,4,3,2,1

    int[] output = {5, 6, 7, 1, 2, 3, 4};
    int k = 3;
    rotate(nums, k);
  }

  public static void rotate(int[] nums, int k) {
    k = k % nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
    for (int i : nums) {
      System.out.print(" " + i);
    }
  }

  private static void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[end];
      nums[end] = nums[start];
      nums[start] = temp;
      start++;
      end--;
    }
  }
}
