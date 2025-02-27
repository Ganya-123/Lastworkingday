package sortingtechnique;

import java.util.Arrays;

public class MergeSortedList {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3};
    int[] arr2 = {4, 5, 6, 7};
    int totalLength = arr1.length + arr2.length;
    int[] arr3 = new int[totalLength];
    mergeArray(arr1, arr2, arr3);
    System.out.println(Arrays.toString(arr3));
  }

  private static void mergeArray(int[] arr1, int[] arr2, int[] arr3) {
    int length = arr3.length;
    int i = arr3.length - 1;
    int left = arr1.length - 1;
    int right = arr2.length - 1;
    while (right >= 0 && left >= 0) {
      if (arr2[right] > arr1[left]) {
        arr3[i] = arr2[right];
        right--;

      } else {
        arr3[i] = arr1[left];
        left--;
      }
      i--;
    }
    while (left >= 0) {
      arr3[i] = arr1[left];
      left--;
      i--;
    }
    while (right >= 0) {
      arr3[i] = arr2[right];
      right--;
      i--;
    }
  }
}
