package arrays;

public class MoveZero {
  public static void main(String[] args) {

    int[] arr = {0, 1, 0, 3, 12};
    moveZeros(arr);
    for (int i : arr) {
      System.out.println(i);
    }
  }

  private static void moveZeros(int[] arr) {
    for (int j = 0; j < arr.length; j++) {
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] == 0) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      }
    }
  }
}
