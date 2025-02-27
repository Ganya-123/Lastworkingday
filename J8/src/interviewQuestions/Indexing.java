package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Indexing {
  public static void main(String[] args) {
    String input1 = "sadofsad";
    String input2 = "sad";
    List<Integer> output = findIndexPos(input1, input2);
    System.out.println(output);
  }

  private static List<Integer> findIndexPos(String input1, String input2) {
    List<Integer> indexList = new ArrayList<>();
    int i = 0;
    while (input1.indexOf(input2, i) != -1) {
      indexList.add(input1.indexOf(input2, i));
      i = input1.indexOf(input2, i) + input2.length() - 1;


    }
    return indexList;
  }
}
