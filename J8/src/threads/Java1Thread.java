package threads;

public class Java1Thread implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Apple");
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {

      }
    }
  }
}
