package threads;

public class MultiThread {
  public static void main(String[] args) throws InterruptedException {
    Thread th = Thread.currentThread();
    System.out.println(th.getName());
    th.setName("Ganya");
    Thread.sleep(10_000);
    System.out.println(th.getName());
  }
}
