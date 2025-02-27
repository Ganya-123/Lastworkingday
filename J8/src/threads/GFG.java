package threads;

import java.util.*;

public class GFG {
  public static void main(String[] args) {
    int arr1[] = {1, 2, 3, 0, 0, 0};
    int n1 = arr1.length;

    int arr2[] = {2, 5, 6};
    int n2 = arr2.length;
  }

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = 0;
    while (m <= nums1.length) {
      nums1[m] = nums2[i];
      m++;
      i++;
    }
    Arrays.sort(nums1);
    for (int j:nums1);
  }
}
