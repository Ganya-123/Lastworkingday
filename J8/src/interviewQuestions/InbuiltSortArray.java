package interviewQuestions;

import java.util.Arrays;

public class InbuiltSortArray {
  public static void main(String[] args) {
    String input = "Ganya";
    char[] array = input.toCharArray();
    Arrays.sort(array);
   String str=new String(array);
    System.out.println(str);
  }

}
