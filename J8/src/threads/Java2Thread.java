package threads;

public class Java2Thread implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Boat");
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {

      }
    }
  }
}
