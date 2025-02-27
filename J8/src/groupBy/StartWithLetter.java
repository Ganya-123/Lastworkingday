package groupBy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithLetter {
  public static void main(String[] args) {
    int arr[] = {1, 23, 65, 12, 90, 111};
    List<String> result = Arrays.stream(arr).boxed().map(i -> i + "").filter(i -> i.startsWith("1") || i.startsWith("2")).collect(Collectors.toList());
    System.out.println("Result is" + result);
  }
}
