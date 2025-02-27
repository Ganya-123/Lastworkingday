package interviewQuestions;

public class SortArray {
  public static void main(String[] args) {
    int[] arr = new int[]{1, 3, 2, 4, 7, 5, 6};
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1; j++) {
        if (arr[j + 1] > arr[j]) {
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
