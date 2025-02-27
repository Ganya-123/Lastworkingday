package groupBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringJoin {
  public static void main(String[] args) {
    List<String> ls= Arrays.asList("1","2","3","4");
    String output=String.join("-",ls);
    System.out.println(output);

  }
}
