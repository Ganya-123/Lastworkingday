package interviewQuestions;

import java.util.Arrays;
import java.util.Date;

public class MissingElementArray2 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 8, 9};
    boolean[] boolArray = new boolean[Arrays.stream(arr).max().getAsInt() + 1];
    for (int num : arr) {
      boolArray[num] = true;
    }
    for (int i = 1; i < boolArray.length; i++) {
      if (boolArray[i] == false) {
        System.out.println("Missing element is :" + i);
      }
    }
    Date date=new Date();
    System.out.println(date);
  }
}
