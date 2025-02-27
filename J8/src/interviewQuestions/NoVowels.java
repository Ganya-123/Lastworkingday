package interviewQuestions;

public class NoVowels {
  public static void main(String[] args) {
    String input = "Aeijkl";
    int count = 0;
    for (char ch : input.toCharArray()) {
      switch (Character.toLowerCase(ch)) {
        case ('a'):
        case ('e'):
        case ('i'):
        case ('o'):
        case ('u'):
          count++;
      }
    }
    System.out.println(count);
  }
}
