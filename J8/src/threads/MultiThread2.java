package threads;

public class MultiThread2 {
  public static void main(String[] args) throws InterruptedException {
    for (int i = 0; i < 2; i++) {
      System.out.println("Apple");
      Thread.sleep(3000);
    }
    for (int i = 0; i < 2; i++) {
      System.out.println("Boat");
      Thread.sleep(3000);
    }
    for (int i = 0; i < 2; i++) {
      System.out.println("Cat");
      Thread.sleep(3000);
    }
  }
}
