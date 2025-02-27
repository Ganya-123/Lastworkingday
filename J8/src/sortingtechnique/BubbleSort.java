package sortingtechnique;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int arr[] = {5, 4, 3, 2, 1};
    sortArr(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void sortArr(int[] arr) {
    for (int j = 0; j < arr.length - 1; j++) {
      boolean swapped = false;
      for (int i = 0; i < arr.length - 1 - j; i++) {

        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }
}
