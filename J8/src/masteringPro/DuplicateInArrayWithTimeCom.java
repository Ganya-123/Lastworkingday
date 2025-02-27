package masteringPro;

public class DuplicateInArrayWithTimeCom {
  public static int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int nextNonDup = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[nextNonDup]) {
        nums[nextNonDup + 1] = nums[i];
        nextNonDup++;
      }
    }
    return nextNonDup + 1;
  }


  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 4, 4, 5, 6, 6, 7, 7};
    int newLength = removeDuplicates(arr);
    System.out.print("Array after removing duplicates: ");
    for (int i = 0; i < newLength; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}

