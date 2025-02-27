package arrays;

public class SortArrayOneSide {
  public static void main(String[] args) {
    int[] arr = {1, 0, 1, 1, 1, 0};
    rearrangeArray(arr);
    for (int i : arr) {
      System.out.println(i);
    }
  }

  private static void rearrangeArray(int[] arr) {
    int right = 0;
    int left = arr.length - 1;
    while (right < left) {
      if (arr[right] == 1 && arr[left] == 0) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        right++;
        left--;
      }
      if (arr[left] == 1) {
        left--;
      }
      if (arr[right] == 0) {
        right++;
      }
    }
  }
}
