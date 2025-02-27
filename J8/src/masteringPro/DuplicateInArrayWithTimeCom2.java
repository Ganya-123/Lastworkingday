package masteringPro;

public class DuplicateInArrayWithTimeCom2 {


  public static void main(String[] args) {
    int arr[] = {1, 2, 2, 3, 4, 4, 4};
    int result = findNonduplicates(arr);
    for (int i = 0; i < result; i++) {
      System.out.print(" " + arr[i]);
    }
  }

  private static int findNonduplicates(int[] arr) {
    int nonDupPosition = 1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[nonDupPosition - 1]) {
        arr[nonDupPosition] = arr[i];
        nonDupPosition++;
      }
    }
    return nonDupPosition;
  }
}
