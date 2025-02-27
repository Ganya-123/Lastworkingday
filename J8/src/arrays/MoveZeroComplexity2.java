package arrays;

import java.util.Arrays;

public class MoveZeroComplexity2 {
  public static void main(String[] args) {
    int arr[] = {1, 0, 9, 0, 5, 8};
    int[] output = shiftZeros(arr);
    System.out.println(
      Arrays.toString(output));
  }

  private static int[] shiftZeros(int[] arr) {
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        arr[j] = arr[i];
        j++;
      }
    }
    for (int k=j; k< arr.length; k++) {
      arr[k] = 0;
    }
    return arr;
  }
}
