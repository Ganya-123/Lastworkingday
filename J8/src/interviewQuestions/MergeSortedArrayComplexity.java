package interviewQuestions;

public class MergeSortedArrayComplexity {
  public static void main(String[] args) {
    int[] nums2 = {1, 1, 6};
    int n = 3;
    int[] nums1 = {0,0,0};
    int m = 0;
    merge(nums1, m, nums2, n);
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1 = m - 1;
    int p2 = n - 1;
    int i = nums1.length - 1;
    while (p2 >= 0) {
      if (p1>0 && nums1[p1] > nums2[p2]) {
        nums1[i] = nums1[p1];
        i--;
        p1--;
      } else {
        nums1[i] = nums2[p2];
        i--;
        p2--;
      }
    }
    for (int output : nums1) {
      System.out.println(output);
    }
  }
}
