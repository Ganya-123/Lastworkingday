package interviewQuestions;

public class ContainerWater {
  public static void main(String[] args) {
    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    int output = maxArea(height);
    System.out.println(output);
  }

  public static int maxArea(int[] height) {
    int start = 0;
    int end = height.length-1;
    int maxSpace = 0;
    while (start < end) {
      int totalSpace = Math.min(height[start], height[end]) * (end - start);

      if (totalSpace > maxSpace) {
        maxSpace = totalSpace;
      }
      if (height[start] < height[end]) {
        start++;
      } else {
        end--;
      }
    }

    return maxSpace;
  }
}
