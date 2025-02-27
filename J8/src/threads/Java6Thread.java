package threads;

public class Java6Thread extends Thread{

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Fan");
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {

      }
    }
  }
}
