package interviewQuestions;

public class TwoSumTwo {
  public static void main(String[] args) {
    int[] numbers = {2, 7, 11, 15};
    int target = 9;
    int[] output = twoSum(numbers, target);
    System.out.println(output[0] + " " + output[1]);
  }

  private static int[] twoSum(int[] numbers, int target) {
    int firstPointer = 0;
    int endPointer = numbers.length - 1;
    while (firstPointer < endPointer) {
      int sum = numbers[firstPointer] + numbers[endPointer];
      if (sum == target) {
        return new int[]{firstPointer + 1, endPointer + 1};
      } else if (sum > target) {
        endPointer--;
      } else {
        firstPointer++;
      }
    }
    return new int[]{};
  }
}
