package arrays;

public class SingleNumberExOr {
  public static void main(String[] args) {
    Integer nums[] = {4, 1, 2, 1, 2};
    int result = 0;
    for (int i : nums) {
      result = result ^ i;
    }
    System.out.println(result);
  }
}
