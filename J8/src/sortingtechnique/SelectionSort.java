package sortingtechnique;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int arr[] = {5, 4, 3, 2, 1};
    sortArr(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void sortArr(int[] arr) {
    for (int j = 0; j < arr.length - 1; j++) {
      int minIndex = j;
      for (int i = j + 1; i < arr.length; i++) {
        if (arr[minIndex] > arr[i]) {
          minIndex = i;
        }
      }
      swapElements(arr, minIndex, j);
    }
  }

  private static void swapElements(int[] arr, int i, int min) {
    int temp = arr[min];
    arr[min] = arr[i];
    arr[i] = temp;
  }
}
