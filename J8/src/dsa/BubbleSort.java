package dsa;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {3, 1, 4, 2, 9, 5, 8};
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    for (int num : arr) {
      System.out.println(num);
    }
  }
}
