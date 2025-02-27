package designPatterns.Singleton;

public class DoubleLockedSingleton {
  private DoubleLockedSingleton() {
  }

  private static DoubleLockedSingleton singletonInstance;

  public static synchronized DoubleLockedSingleton getInstance() {
    if (singletonInstance == null) {
      synchronized (DoubleLockedSingleton.class) {
        if (singletonInstance == null) {
          return singletonInstance = new DoubleLockedSingleton();
        }
      }
    }
    return singletonInstance;
  }
}
