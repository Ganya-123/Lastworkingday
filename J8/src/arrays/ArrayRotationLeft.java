package arrays;

import java.util.Scanner;

public class ArrayRotationLeft {
  public static void main(String[] args) {
    int[] array = new int[]{1, 2, 3, 4, 5};
    int rotate = 3;//45123
//    Scanner scanner = new Scanner(System.in);
//    int rotate = scanner.nextInt();
    for (int i = 0; i < rotate; i++) {
      int first = array[0], j;
      for (j = 0; j < array.length - 1; j++) {
        array[j] = array[j + 1];
      }
      array[j] = first;
    }
    for (int num : array) {
      System.out.println(num);
    }
  }
}
