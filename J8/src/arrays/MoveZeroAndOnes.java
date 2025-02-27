package arrays;

import java.util.Arrays;

public class MoveZeroAndOnes {
  public static void main(String[] args) {
    int arr[] = {0, 1, 0, 1, 0, 1, 1};
    int[] output = shiftZerosAndOnes(arr);
    System.out.println(Arrays.toString(output));
  }

  private static int[] shiftZerosAndOnes(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      while (start < end && arr[end] == 0) {
        end--;
      }
      while (start < end && arr[start] == 1) {
        start++;
      }
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    return arr;
  }
}
