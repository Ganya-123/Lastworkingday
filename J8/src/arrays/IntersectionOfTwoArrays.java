package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
  public static void main(String[] args) {
    int[] nums1 = {4, 9, 4, 5};
    int[] nums2 = {9,4,9,8,4};
    int[] output = findIntersection(nums1, nums2);
    System.out.println(Arrays.toString(output));
  }

  private static int[] findIntersection(int[] nums1, int[] nums2) {
    int i = nums1.length - 1;
    HashSet<Integer> set = new HashSet<>();
    while (i >= 0) {
      set.add(nums1[i]);
      i--;
    }
    HashSet<Integer> intersectSet = new HashSet<>();
    int j = nums2.length - 1;
    while (j >= 0) {
      if (set.contains(nums2[j])) {
        intersectSet.add(nums2[j]);
      }
      j--;
    }
    int position = 0;
    int[] outputArray = new int[intersectSet.size()];
    for (int k : intersectSet) {
      outputArray[position++] = k;
    }
    return outputArray;
  }
}
