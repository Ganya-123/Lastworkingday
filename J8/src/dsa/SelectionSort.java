package dsa;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = {3, 1, 4, 2, 9, 5, 8};

    for (int i = 0; i < arr.length-1; i++) {
      int minValue = arr[i];
      int minIndex = i;
      for (int j = i; j < arr.length; j++) {
        if (arr[j] < minValue) {
          minValue = arr[j];
          minIndex = j;
        }
      }
      int temp = arr[i];
      arr[i] = minValue;
      arr[minIndex] = temp;
    }
    for (int num : arr) {
      System.out.println(num);
    }
  }
}
