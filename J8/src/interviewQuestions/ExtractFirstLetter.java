package interviewQuestions;

public class ExtractFirstLetter {
  public static void main(String[] args) {
    String input = "Hi I am GAnya";
    String array[] = input.split(" ");
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i].substring(0,1));


    }

  }
}
