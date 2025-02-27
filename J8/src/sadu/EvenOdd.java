package sadu;

public class EvenOdd {
  public static void main(String[] args) {
    int input = 6;
    Boolean result = isEvenOdd(input);
    System.out.println(result);
  }


  private static Boolean isEvenOdd(int input) {
    if (input % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
}
