package arrays;

public class ClimbingStairs {
  public static void main(String[] args) {
    int inputStep = 5;
    int outputWays = findNoOfWays(inputStep);
    System.out.println(outputWays);
  }

  private static int findNoOfWays(int inputStep) {
    int[] arr = new int[inputStep + 1];
    arr[1] = 1;
    arr[2] = 2;
    for (int i = 3; i < arr.length; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }
    return arr[inputStep];
  }
}
