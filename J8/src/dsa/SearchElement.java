package dsa;

public class SearchElement {
  public static void main(String[] args) {
    int[] arr = {1,2,3};
    int search = 1;
    int linearResult = searchLinear(arr, search);
    if (linearResult == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("Linear Element found at index : " + linearResult);
    }
    int binaryResult = binarySearch(arr, search);
    if (binaryResult == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("Binary Element found at index : " + binaryResult);
    }
  }

  public static int searchLinear(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static int binarySearch(int[] array, int target) {
//1,2,3,4,5
    int left = 0;
    int right = array.length - 1;
    while (left <= right) {
      int mid = (right + left) / 2;
      if (array[mid] == target) {
        return mid;
      } else if (target < array[mid]) {
        right = mid-1;

      } else {
        left = mid+1;
      }
    }
    return -1;
  }
}
