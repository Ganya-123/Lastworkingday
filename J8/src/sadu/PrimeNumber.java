package sadu;

public class PrimeNumber {
  public static void main(String[] args) {
    for (int i = 2; i < 100; i++) {
      Boolean result = isprime(i);
      if (result) {
        System.out.println(i + " " + "prime");
      } else {
        System.out.println(i + " " + "not prime");
      }
    }
  }

  private static Boolean isprime(int i) {
    for (int j = 2; j <= i / 2; j++) {
      if (i % j == 0) {
        return false;
      }
    }
    return true;
  }
}
