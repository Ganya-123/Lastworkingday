package interviewQuestions;

import java.util.Arrays;

public class ShiftOnes {
  public static void main(String[] args) {
    int[] arr = {1, 0, 1, 1, 0, 0, 0, 1};
    shiftOnesToRight(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void shiftOnesToRight(int[] arr) {
    int right = 0;
    int left = 0;
    while (right < arr.length) {
      if (arr[right] != 1) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
      }
      right++;
    }
  }
}
