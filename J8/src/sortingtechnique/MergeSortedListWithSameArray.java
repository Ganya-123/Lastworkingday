package sortingtechnique;

import java.util.Arrays;

public class MergeSortedListWithSameArray {
  public static void main(String[] args) {
    int[] arr1 = {2, 3, 0,0};
    int[] arr2 = {4,6};
    int arr1Length = 2;
    int arr2Length = 2;
    mergeArray(arr1, arr2, arr1Length, arr2Length);
    System.out.println(Arrays.toString(arr1));
  }

  private static void mergeArray(int[] arr1, int[] arr2, int arr1Length, int arr2Length) {

    int i = arr1.length - 1;
    int left = arr1Length - 1;
    int right = arr2Length - 1;
    while (right >= 0 && left >= 0) {
      if (arr2[right] > arr1[left]) {
        arr1[i] = arr2[right];
        right--;

      } else {
        arr1[i] = arr1[left];
        left--;
      }
      i--;
    }
    //    while (left >= 0) {
    //      arr1[i] = arr1[left];
    //      left--;
    //      i--;
    //    }
    while (right >= 0) {
      arr1[i] = arr2[right];
      right--;
      i--;
    }
  }
}
