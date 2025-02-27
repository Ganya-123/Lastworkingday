package interviewQuestions;

public class RemoveDuplicatesFromSortedArrayTwo {
  public static void main(String[] args) {
    int[] nums = {1, 1, 1, 2, 2, 3};
    int result = removeDuplicates(nums);
    System.out.println(result);

  }

  public static int removeDuplicates(int[] nums) {
    if (nums.length <= 2) {
      return nums.length;
    }
    int totalCount = 2;

    for (int i = 2; i < nums.length; i++) {
      if (nums[i] != nums[i - 2]) {
        nums[totalCount] = nums[i];
        totalCount++;
      }
    }
    return totalCount;
  }
}
