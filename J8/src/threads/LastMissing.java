package threads;

public class LastMissing {
  public static void main(String[] args) {
    int[] arr = {1, 2, 4, 5, 6, 8};
    int k = 3;
    boolean[] boolArr = new boolean[arr.length + k + 1];
    for (int a : arr) {
      boolArr[a] = true;
    }
    int last = 0;
    int count = 0;
    for (int i = 0; i < boolArr.length; i++) {
      if (!boolArr[i]) {
        count = count + 1;
        if (count == k) {
          last = i;
        }
      }
    }
    System.out.println("last is:" + last);
  }
}
