package interviewQuestions;

public class Power {
  public static void main(String[] args) {
    double output = getPower(2, 3);
    System.out.println("out put is" + output);
  }

  public static double getPower(int a, int b) {
    double value = 1;
    for (int i = 0; i < b; i++) {
      value = value * a;

    }
    return value;
  }
}
