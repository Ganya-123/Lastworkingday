package arrays;

public class ArrayRotationRight {
  public static void main(String[] args) {
    int[] array = new int[]{1, 2, 3, 4, 5};
    int rotate = 3, j;//34512
    for (int i = 0; i < rotate; i++) {
      int last = array[array.length - 1];
      for (j = array.length - 1; j > 0; j--) {
        array[j] = array[j - 1];
      }
      array[0] = last;
    }
    for (int num : array) {
      System.out.println(num);
    }
  }
}
