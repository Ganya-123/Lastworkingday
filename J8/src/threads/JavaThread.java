package threads;

public class JavaThread {
  public static void main(String[] args) {
    // implementing Runnable interface
    create1Thread();
    create2Thread();
    create3Thread();

    //extending thread
    create4Thread();
    create5Thread();
    create6Thread();
  }


  private static void create1Thread() {
    Java1Thread java1Thread = new Java1Thread();
    Thread thread = new Thread(java1Thread);
    thread.setName("java1");
    thread.start();
  }

  private static void create2Thread() {
    Java2Thread java2Thread = new Java2Thread();
    Thread thread = new Thread(java2Thread);
    thread.setName("java2");
    thread.start();
  }

  private static void create3Thread() {
    Java3Thread java3Thread = new Java3Thread();
    Thread thread = new Thread(java3Thread);
    thread.setName("java3");
    thread.start();

  }

  private static void create4Thread() {
    new Java4Thread().start();
  }

  private static void create5Thread() {
    new Java5Thread().start();
  }

  private static void create6Thread() {
    new Java6Thread().start();
  }


}
