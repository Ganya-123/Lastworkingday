package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatesInArray {
  public static void main(String[] args) {
    List<Integer> ls = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 5));


    for (int i = 0; i < ls.size(); i++) {
      int value = ls.get(i);
      ls.remove(i);

      if (ls.contains(value)) {
        System.out.println("Duplicates: " + value);
      }
    }
  }
}
