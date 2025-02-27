package interviewQuestions;

import java.util.Arrays;

public class PlusOne {
  public static void main(String[] args) {
    //    Example 2:
    //
    //    Input: digits = [4,3,2,9]
    //    Output: [4,3,3,0]
    //    Explanation: The array represents the integer 4321.
    //    Incrementing by one gives 4321 + 1 = 4322.
    //    Thus, the result should be [4,3,2,2].
    //    Example 3:
    //
    //    Input: digits = [9,9,9]
    //    Output: [1,0,0,0]
    //    Explanation: The array represents the integer 9.
    //    Incrementing by one gives 9 + 1 = 10.
    //    Thus, the result should be [1,0].
    int[] input = {9};
    int[] output = findPlusOne(input);
    System.out.println(Arrays.toString(output));
  }

  private static int[] findPlusOne(int[] input) {
    for (int i = input.length - 1; i >= 0; i--) {
      if (input[i] != 9) {
        input[i]++;
        return input;
      } else {
        input[i] = 0;
      }
    }
    int[] output = new int[input.length + 1];
    output[0] = 1;
    return output;
  }
}
