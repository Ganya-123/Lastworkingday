package interviewQuestions;

import java.util.Arrays;

public class MergeSortedArray {
  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int m = 3;
    int[] nums2 = {2, 5, 6};
    int n = 3;
    merge(nums1, m, nums2, 3);
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = 0;
    while (m < nums1.length) {
      nums1[m] = nums2[i];
      m++;
      i++;
    }
    Arrays.sort(nums1);
    for (int output : nums1) {
      System.out.println(output);
    }
  }
}
