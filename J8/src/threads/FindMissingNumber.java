package threads;

public class FindMissingNumber {
  public static void main(String[] args) {
    int[] arr = new int[]{
      -3, -1, 0, 3
    };
    System.out.println(findFirstMissingElement(arr));


  }

  private static int findFirstMissingElement(int[] arr) {
    // int increment = arr[0];
    for (int i = 1; i < arr.length; i++) {
      int current = arr[i];
      int back = arr[i - 1];
      if (current != back + 1) {
        return back + 1;
      }

    }

    return Integer.MAX_VALUE;
  }
}
