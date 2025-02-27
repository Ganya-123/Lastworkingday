package interviewQuestions;

public class SpeicalRotation {
  public static void main(String[] args) {
    String a = "ABCD";
    String b = "CDAk";// ABCDABCD
    if (isRotation(a, b)) {
      System.out.println("rotation is perfect");
    } else {
      System.out.println("rotation is not perfect");
    }
  }

  private static boolean isRotation(String a, String b) {
    return a.length() == b.length() && (a + a).indexOf(b) != -1;
  }
}
