package arrays;

public class SearchInsertPosition {
  public static void main(String[] args) {
    int nums[] = {1, 3, 5, 6};
    int target = 8;
    int result = findTargetPosition(nums, target);
    System.out.println(result);
  }

  private static int findTargetPosition(int[] nums, int target) {
    if (target > nums[nums.length - 1]) {
      return nums.length;
    } else if (target < nums[0] ) {
      return 0;
    }
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == target) {
        return i;
      } else if (target > nums[i] && target < nums[i + 1]) {
        return i + 1;
      }
    }
    return nums.length-1;
  }
}
;
