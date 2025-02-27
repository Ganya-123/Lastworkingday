package threads;

public class Java3Thread implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Cat");
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }

  }
}
